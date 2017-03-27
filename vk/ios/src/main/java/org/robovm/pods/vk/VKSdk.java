/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.vk;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKSdk/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKSdkPtr extends Ptr<VKSdk, VKSdkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKSdk.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VKSdk() {}
    protected VKSdk(Handle h, long handle) { super(h, handle); }
    protected VKSdk(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uiDelegate")
    public native VKSdkUIDelegate getUiDelegate();
    @Property(selector = "setUiDelegate:", strongRef = true)
    public native void setUiDelegate(VKSdkUIDelegate v);
    @Property(selector = "currentAppId")
    public native String getCurrentAppId();
    @Property(selector = "apiVersion")
    public native String getApiVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerDelegate:")
    public native void registerDelegate(VKSdkDelegate delegate);
    @Method(selector = "unregisterDelegate:")
    public native void unregisterDelegate(VKSdkDelegate delegate);
    @Method(selector = "instance")
    public static native VKSdk instance();
    @Method(selector = "initializeWithAppId:")
    public static native VKSdk initializeWithAppId(String appId);
    @Method(selector = "initializeWithAppId:apiVersion:")
    public static native VKSdk initializeWithAppId(String appId, String version);
    @Method(selector = "authorize:")
    public static native void authorize(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions);
    @Method(selector = "authorize:withOptions:")
    public static native void authorize(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, VKAuthorizationOptions options);
    @Method(selector = "accessToken")
    public static native VKAccessToken accessToken();
    @Method(selector = "wakeUpSession:completeBlock:")
    public static native void wakeUpSession(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, @Block VoidBlock2<VKAuthorizationState, NSError> wakeUpBlock);
    @Method(selector = "forceLogout")
    public static native void forceLogout();
    @Method(selector = "setSchedulerEnabled:")
    public static native void setSchedulerEnabled(boolean enabled);
    /*</methods>*/

    @Method(selector = "processOpenURL:fromApplication:")
    public static native boolean processOpenURL(NSURL passedUrl, String fromApplication);
}
