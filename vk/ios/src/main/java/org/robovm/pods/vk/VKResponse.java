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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKResponse/*</name>*/<T extends VKApiObject>
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKResponsePtr extends Ptr<VKResponse, VKResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKResponse() {}
    protected VKResponse(Handle h, long handle) { super(h, handle); }
    protected VKResponse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "request")
    public native VKRequest getRequest();
    @Property(selector = "setRequest:", strongRef = true)
    public native void setRequest(VKRequest v);
    @Property(selector = "json")
    public native NSObject getJson();
    @Property(selector = "setJson:")
    public native void setJson(NSObject v);
    @Property(selector = "parsedModel")
    public native T getParsedModel();
    @Property(selector = "setParsedModel:")
    public native void setParsedModel(T v);
    @Property(selector = "responseString")
    public native String getResponseString();
    @Property(selector = "setResponseString:")
    public native void setResponseString(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
