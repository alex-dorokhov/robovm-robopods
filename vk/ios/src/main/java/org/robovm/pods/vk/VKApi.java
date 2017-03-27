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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKApi/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKApiPtr extends Ptr<VKApi, VKApiPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKApi.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKApi() {}
    protected VKApi(Handle h, long handle) { super(h, handle); }
    protected VKApi(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "users")
    public static native VKApiUsers users();
    @Method(selector = "wall")
    public static native VKApiWall wall();
    @Method(selector = "photos")
    public static native VKApiPhotos photos();
    @Method(selector = "friends")
    public static native VKApiFriends friends();
    @Method(selector = "groups")
    public static native VKApiGroups groups();
    @Method(selector = "requestWithMethod:andParameters:andHttpMethod:")
    public static native VKRequest requestWithMethod(String method, NSDictionary<?, ?> parameters, String httpMethod);
    @Method(selector = "requestWithMethod:andParameters:")
    public static native VKRequest requestWithMethod(String method, NSDictionary<?, ?> parameters);
    @Method(selector = "uploadWallPhotoRequest:parameters:userId:groupId:")
    public static native VKRequest uploadWallPhotoRequest(UIImage image, VKImageParameters parameters, @MachineSizedSInt long userId, @MachineSizedSInt long groupId);
    @Method(selector = "uploadAlbumPhotoRequest:parameters:albumId:groupId:")
    public static native VKRequest uploadAlbumPhotoRequest(UIImage image, VKImageParameters parameters, @MachineSizedSInt long albumId, @MachineSizedSInt long groupId);
    @Method(selector = "uploadMessagePhotoRequest:parameters:")
    public static native VKRequest uploadMessagePhotoRequest(UIImage image, VKImageParameters parameters);
    /*</methods>*/
}
