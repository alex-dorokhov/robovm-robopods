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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKAccessToken/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class VKAccessTokenPtr extends Ptr<VKAccessToken, VKAccessTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKAccessToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKAccessToken() {}
    protected VKAccessToken(Handle h, long handle) { super(h, handle); }
    protected VKAccessToken(SkipInit skipInit) { super(skipInit); }
    public VKAccessToken(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessToken")
    public native String getAccessToken();
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "secret")
    public native String getSecret();
    @Property(selector = "permissions")
    public native NSArray<?> getPermissions();
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "expiresIn")
    public native @MachineSizedSInt long getExpiresIn();
    @Property(selector = "httpsRequired")
    public native boolean isHttpsRequired();
    @Property(selector = "created")
    public native double getCreated();
    @Property(selector = "localUser")
    public native VKUser getLocalUser();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveTokenToDefaults:")
    public native void saveTokenToDefaults(String defaultsKey);
    @Method(selector = "tokenFromUrlString:")
    public static native VKAccessToken tokenFromUrlString(String urlString);
    @Method(selector = "tokenWithToken:secret:userId:")
    public static native VKAccessToken tokenWithToken(String accessToken, String secret, String userId);
    @Method(selector = "savedToken:")
    public static native VKAccessToken savedToken(String defaultsKey);
    @Method(selector = "delete:")
    public static native void delete(String service);
    @Method(selector = "notifyTokenExpired")
    public native void notifyTokenExpired();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
