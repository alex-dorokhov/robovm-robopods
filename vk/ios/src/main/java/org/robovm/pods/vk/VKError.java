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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKError/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static final int VK_API_ERROR = -101;
    public static final int VK_API_CANCELED = -102;
    public static final int VK_API_REQUEST_NOT_PREPARED = -103;
    public static final int VK_RESPONSE_STRING_PARSING_ERROR = -104;
    public static final int VK_AUTHORIZE_CONTROLLER_CANCEL = -105;
        
    /*<ptr>*/public static class VKErrorPtr extends Ptr<VKError, VKErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKError() {}
    protected VKError(Handle h, long handle) { super(h, handle); }
    protected VKError(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "httpError")
    public native NSError getHttpError();
    @Property(selector = "setHttpError:")
    public native void setHttpError(NSError v);
    @Property(selector = "apiError")
    public native VKError getApiError();
    @Property(selector = "setApiError:")
    public native void setApiError(VKError v);
    @Property(selector = "request")
    public native VKRequest getRequest();
    @Property(selector = "setRequest:")
    public native void setRequest(VKRequest v);
    @Property(selector = "errorCode")
    public native @MachineSizedSInt long getErrorCode();
    @Property(selector = "setErrorCode:")
    public native void setErrorCode(@MachineSizedSInt long v);
    @Property(selector = "errorMessage")
    public native String getErrorMessage();
    @Property(selector = "setErrorMessage:")
    public native void setErrorMessage(String v);
    @Property(selector = "errorReason")
    public native String getErrorReason();
    @Property(selector = "setErrorReason:")
    public native void setErrorReason(String v);
    @Property(selector = "errorText")
    public native String getErrorText();
    @Property(selector = "setErrorText:")
    public native void setErrorText(String v);
    @Property(selector = "requestParams")
    public native NSDictionary<?, ?> getRequestParams();
    @Property(selector = "setRequestParams:")
    public native void setRequestParams(NSDictionary<?, ?> v);
    @Property(selector = "captchaSid")
    public native String getCaptchaSid();
    @Property(selector = "setCaptchaSid:")
    public native void setCaptchaSid(String v);
    @Property(selector = "captchaImg")
    public native String getCaptchaImg();
    @Property(selector = "setCaptchaImg:")
    public native void setCaptchaImg(String v);
    @Property(selector = "redirectUri")
    public native String getRedirectUri();
    @Property(selector = "setRedirectUri:")
    public native void setRedirectUri(String v);
    @Property(selector = "json")
    public native NSObject getJson();
    @Property(selector = "setJson:")
    public native void setJson(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "answerCaptcha:")
    public native void answerCaptcha$(String userEnteredCode);
    @Method(selector = "errorWithCode:")
    public static native VKError errorWithCode$(@MachineSizedSInt long errorCode);
    @Method(selector = "errorWithJson:")
    public static native VKError errorWithJson$(NSObject JSON);
    @Method(selector = "errorWithQuery:")
    public static native VKError errorWithQuery$(NSDictionary<?, ?> queryParams);
    /*</methods>*/
}
