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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKRequest/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKRequestPtr extends Ptr<VKRequest, VKRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKRequest() {}
    protected VKRequest(Handle h, long handle) { super(h, handle); }
    protected VKRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "progressBlock")
    public native @Block VoidBlock3<VKProgressType, Long, Long> getProgressBlock();
    @Property(selector = "setProgressBlock:")
    public native void setProgressBlock(@Block VoidBlock3<VKProgressType, Long, Long> v);
    @Property(selector = "completeBlock")
    public native @Block VoidBlock1<VKResponse> getCompleteBlock();
    @Property(selector = "setCompleteBlock:")
    public native void setCompleteBlock(@Block VoidBlock1<VKResponse> v);
    @Property(selector = "errorBlock")
    public native @Block VoidBlock1<NSError> getErrorBlock();
    @Property(selector = "setErrorBlock:")
    public native void setErrorBlock(@Block VoidBlock1<NSError> v);
    @Property(selector = "attempts")
    public native int getAttempts();
    @Property(selector = "setAttempts:")
    public native void setAttempts(int v);
    @Property(selector = "secure")
    public native boolean isSecure();
    @Property(selector = "setSecure:")
    public native void setSecure(boolean v);
    @Property(selector = "useSystemLanguage")
    public native boolean isUseSystemLanguage();
    @Property(selector = "setUseSystemLanguage:")
    public native void setUseSystemLanguage(boolean v);
    @Property(selector = "parseModel")
    public native boolean isParseModel();
    @Property(selector = "setParseModel:")
    public native void setParseModel(boolean v);
    @Property(selector = "debugTiming")
    public native boolean isDebugTiming();
    @Property(selector = "setDebugTiming:")
    public native void setDebugTiming(boolean v);
    @Property(selector = "requestTimeout")
    public native @MachineSizedSInt long getRequestTimeout();
    @Property(selector = "setRequestTimeout:")
    public native void setRequestTimeout(@MachineSizedSInt long v);
    @Property(selector = "responseQueue")
    public native DispatchQueue getResponseQueue();
    @Property(selector = "setResponseQueue:", strongRef = true)
    public native void setResponseQueue(DispatchQueue v);
    @Property(selector = "waitUntilDone")
    public native boolean isWaitUntilDone();
    @Property(selector = "setWaitUntilDone:")
    public native void setWaitUntilDone(boolean v);
    @Property(selector = "methodName")
    public native String getMethodName();
    @Property(selector = "httpMethod")
    public native String getHttpMethod();
    @Property(selector = "methodParameters")
    public native NSDictionary<?, ?> getMethodParameters();
    @Property(selector = "executionOperation")
    public native NSOperation getExecutionOperation();
    @Property(selector = "requestTiming")
    public native VKRequestTiming getRequestTiming();
    @Property(selector = "isExecuting")
    public native boolean isExecuting();
    @Property(selector = "preventThisErrorsHandling")
    public native NSArray<?> getPreventThisErrorsHandling();
    @Property(selector = "setPreventThisErrorsHandling:")
    public native void setPreventThisErrorsHandling(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getPreparedRequest")
    public native NSURLRequest getPreparedRequest();
    @Method(selector = "executeWithResultBlock:errorBlock:")
    public native void executeWithResultBlock(@Block VoidBlock1<VKResponse> completeBlock, @Block VoidBlock1<NSError> errorBlock);
    @Method(selector = "executeAfter:withResultBlock:errorBlock:")
    public native void executeAfter(VKRequest request, @Block VoidBlock1<VKResponse> completeBlock, @Block VoidBlock1<NSError> errorBlock);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "createExecutionOperation")
    public native NSOperation createExecutionOperation();
    @Method(selector = "repeat")
    public native void repeat();
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "addExtraParameters:")
    public native void addExtraParameters(NSDictionary<?, ?> extraParameters);
    @Method(selector = "setPreferredLang:")
    public native void setPreferredLang(String lang);
    @Method(selector = "requestWithMethod:parameters:")
    public static native VKRequest requestWithMethod(String method, NSDictionary<?, ?> parameters);
    @Method(selector = "requestWithMethod:parameters:modelClass:")
    public static native VKRequest requestWithMethod(String method, NSDictionary<?, ?> parameters, Class<?> modelClass);
    @Method(selector = "photoRequestWithPostUrl:withPhotos:")
    public static native VKRequest photoRequestWithPostUrl(String url, NSArray<?> photoObjects);
    /*</methods>*/
}
