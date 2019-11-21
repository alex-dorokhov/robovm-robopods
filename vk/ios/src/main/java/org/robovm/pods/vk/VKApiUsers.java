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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKApiUsers/*</name>*/ 
    extends /*<extends>*/VKApiBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKApiUsersPtr extends Ptr<VKApiUsers, VKApiUsersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKApiUsers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKApiUsers() {}
    protected VKApiUsers(Handle h, long handle) { super(h, handle); }
    protected VKApiUsers(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "get")
    public native VKRequest get();
    @Method(selector = "get:")
    public native VKRequest get(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> params);
    @Method(selector = "search:")
    public native VKRequest search(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> params);
    @Method(selector = "isAppUser")
    public native VKRequest isAppUser();
    @Method(selector = "isAppUser:")
    public native VKRequest isAppUser(@MachineSizedSInt long userID);
    @Method(selector = "getSubscriptions")
    public native VKRequest getSubscriptions();
    @Method(selector = "getSubscriptions:")
    public native VKRequest getSubscriptions(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> params);
    @Method(selector = "getFollowers")
    public native VKRequest getFollowers();
    @Method(selector = "getFollowers:")
    public native VKRequest getFollowers(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> params);
    /*</methods>*/
}