package com.example.testweexdemo;

import android.app.Application;

import com.example.testweexdemo.framework.commons.adapter.ImageAdapter;
import com.example.testweexdemo.framework.commons.util.AppConfig;
import com.example.testweexdemo.framework.extend.component.RichText;
import com.example.testweexdemo.framework.extend.module.LogModule;
import com.example.testweexdemo.framework.extend.module.RenderModule;
import com.example.testweexdemo.framework.extend.module.TextBoxModule;
import com.example.testweexdemo.framework.extend.module.ToastModule;
import com.example.testweexdemo.framework.extend.module.WXEventModule;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.weex.ui.component.WXWeb;

/**
 * Created by Hilary
 * on 2016/11/28.
 */

public class WXApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        initDebugEnvironment(false, "192.168.2.29");


        WXSDKEngine.addCustomOptions("appName", "WXSample");
        WXSDKEngine.addCustomOptions("appGroup", "WXApp");
        WXSDKEngine.initialize(this,
                new InitConfig.Builder()
                        .setImgAdapter(new ImageAdapter())
                        .build()
        );

        Fresco.initialize(this);
        AppConfig.init(this);
        try {
//            WXSDKEngine.registerModule("stream", WXStreamModule.class);
            WXSDKEngine.registerComponent("richtext", RichText.class);
            WXSDKEngine.registerComponent("web",WXWeb.class);
            WXSDKEngine.registerModule("event", WXEventModule.class);
            WXSDKEngine.registerModule("toastModule", ToastModule.class);
            WXSDKEngine.registerModule("textBoxModule", TextBoxModule.class);
            WXSDKEngine.registerModule("myModule", LogModule.class);
            WXSDKEngine.registerModule("render", RenderModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
//        ExtensionManager.registerComponents(AppConfig.getComponents());
//        ExtensionManager.registerModules(AppConfig.getModules());

    }

    /**
     * @param enable enable remote debugger. valid only if host not to be "DEBUG_SERVER_HOST".
     *               true, you can launch a remote debugger and inspector both.
     *               false, you can  just launch a inspector.
     * @param host   the debug server host, must not be "DEBUG_SERVER_HOST", a ip address or domain will be OK.
     *               for example "127.0.0.1".
     */
    private void initDebugEnvironment(boolean enable, String host) {
        if (!"DEBUG_SERVER_HOST".equals(host)) {
            WXEnvironment.sRemoteDebugMode = enable;
            WXEnvironment.sRemoteDebugProxyUrl = "ws://" + host + ":8088/debugProxy/native";
        }
    }

}
