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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKApiConst/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(VKApiConst.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="VK_API_USER_ID", optional=true)
    public static native String USER_ID();
    @GlobalValue(symbol="VK_API_USER_IDS", optional=true)
    public static native String USER_IDS();
    @GlobalValue(symbol="VK_API_FIELDS", optional=true)
    public static native String FIELDS();
    @GlobalValue(symbol="VK_API_SORT", optional=true)
    public static native String SORT();
    @GlobalValue(symbol="VK_API_OFFSET", optional=true)
    public static native String OFFSET();
    @GlobalValue(symbol="VK_API_COUNT", optional=true)
    public static native String COUNT();
    @GlobalValue(symbol="VK_API_OWNER_ID", optional=true)
    public static native String OWNER_ID();
    @GlobalValue(symbol="VK_API_LANG", optional=true)
    public static native String LANG();
    @GlobalValue(symbol="VK_API_ACCESS_TOKEN", optional=true)
    public static native String ACCESS_TOKEN();
    @GlobalValue(symbol="VK_API_SIG", optional=true)
    public static native String SIG();
    @GlobalValue(symbol="VK_API_NAME_CASE", optional=true)
    public static native String NAME_CASE();
    @GlobalValue(symbol="VK_API_ORDER", optional=true)
    public static native String ORDER();
    @GlobalValue(symbol="VK_API_EXTENDED", optional=true)
    public static native String EXTENDED();
    @GlobalValue(symbol="VK_API_Q", optional=true)
    public static native String Q();
    @GlobalValue(symbol="VK_API_CITY", optional=true)
    public static native String CITY();
    @GlobalValue(symbol="VK_API_COUNTRY", optional=true)
    public static native String COUNTRY();
    @GlobalValue(symbol="VK_API_HOMETOWN", optional=true)
    public static native String HOMETOWN();
    @GlobalValue(symbol="VK_API_UNIVERSITY_COUNTRY", optional=true)
    public static native String UNIVERSITY_COUNTRY();
    @GlobalValue(symbol="VK_API_UNIVERSITY", optional=true)
    public static native String UNIVERSITY();
    @GlobalValue(symbol="VK_API_UNIVERSITY_YEAR", optional=true)
    public static native String UNIVERSITY_YEAR();
    @GlobalValue(symbol="VK_API_SEX", optional=true)
    public static native String SEX();
    @GlobalValue(symbol="VK_API_STATUS", optional=true)
    public static native String STATUS();
    @GlobalValue(symbol="VK_API_AGE_FROM", optional=true)
    public static native String AGE_FROM();
    @GlobalValue(symbol="VK_API_AGE_TO", optional=true)
    public static native String AGE_TO();
    @GlobalValue(symbol="VK_API_BIRTH_DAY", optional=true)
    public static native String BIRTH_DAY();
    @GlobalValue(symbol="VK_API_BIRTH_MONTH", optional=true)
    public static native String BIRTH_MONTH();
    @GlobalValue(symbol="VK_API_BIRTH_YEAR", optional=true)
    public static native String BIRTH_YEAR();
    @GlobalValue(symbol="VK_API_ONLINE", optional=true)
    public static native String ONLINE();
    @GlobalValue(symbol="VK_API_HAS_PHOTO", optional=true)
    public static native String HAS_PHOTO();
    @GlobalValue(symbol="VK_API_SCHOOL_COUNTRY", optional=true)
    public static native String SCHOOL_COUNTRY();
    @GlobalValue(symbol="VK_API_SCHOOL_CITY", optional=true)
    public static native String SCHOOL_CITY();
    @GlobalValue(symbol="VK_API_SCHOOL", optional=true)
    public static native String SCHOOL();
    @GlobalValue(symbol="VK_API_SCHOOL_YEAR", optional=true)
    public static native String SCHOOL_YEAR();
    @GlobalValue(symbol="VK_API_RELIGION", optional=true)
    public static native String RELIGION();
    @GlobalValue(symbol="VK_API_INTERESTS", optional=true)
    public static native String INTERESTS();
    @GlobalValue(symbol="VK_API_COMPANY", optional=true)
    public static native String COMPANY();
    @GlobalValue(symbol="VK_API_POSITION", optional=true)
    public static native String POSITION();
    @GlobalValue(symbol="VK_API_GROUP_ID", optional=true)
    public static native String GROUP_ID();
    @GlobalValue(symbol="VK_API_GROUP_IDS", optional=true)
    public static native String GROUP_IDS();
    @GlobalValue(symbol="VK_API_FRIENDS_ONLY", optional=true)
    public static native String FRIENDS_ONLY();
    @GlobalValue(symbol="VK_API_FROM_GROUP", optional=true)
    public static native String FROM_GROUP();
    @GlobalValue(symbol="VK_API_MESSAGE", optional=true)
    public static native String MESSAGE();
    @GlobalValue(symbol="VK_API_ATTACHMENT", optional=true)
    public static native String ATTACHMENT();
    @GlobalValue(symbol="VK_API_ATTACHMENTS", optional=true)
    public static native String ATTACHMENTS();
    @GlobalValue(symbol="VK_API_SERVICES", optional=true)
    public static native String SERVICES();
    @GlobalValue(symbol="VK_API_SIGNED", optional=true)
    public static native String SIGNED();
    @GlobalValue(symbol="VK_API_PUBLISH_DATE", optional=true)
    public static native String PUBLISH_DATE();
    @GlobalValue(symbol="VK_API_LAT", optional=true)
    public static native String LAT();
    @GlobalValue(symbol="VK_API_LONG", optional=true)
    public static native String LONG();
    @GlobalValue(symbol="VK_API_PLACE_ID", optional=true)
    public static native String PLACE_ID();
    @GlobalValue(symbol="VK_API_POST_ID", optional=true)
    public static native String POST_ID();
    @GlobalValue(symbol="VK_API_ERROR_CODE", optional=true)
    public static native String ERROR_CODE();
    @GlobalValue(symbol="VK_API_ERROR_MSG", optional=true)
    public static native String ERROR_MSG();
    @GlobalValue(symbol="VK_API_ERROR_TEXT", optional=true)
    public static native String ERROR_TEXT();
    @GlobalValue(symbol="VK_API_REQUEST_PARAMS", optional=true)
    public static native String REQUEST_PARAMS();
    @GlobalValue(symbol="VK_API_CAPTCHA_IMG", optional=true)
    public static native String CAPTCHA_IMG();
    @GlobalValue(symbol="VK_API_CAPTCHA_SID", optional=true)
    public static native String CAPTCHA_SID();
    @GlobalValue(symbol="VK_API_CAPTCHA_KEY", optional=true)
    public static native String CAPTCHA_KEY();
    @GlobalValue(symbol="VK_API_REDIRECT_URI", optional=true)
    public static native String REDIRECT_URI();
    @GlobalValue(symbol="VK_API_DOC_ID", optional=true)
    public static native String DOC_ID();
    @GlobalValue(symbol="VK_API_ACCESS_KEY", optional=true)
    public static native String ACCESS_KEY();
    @GlobalValue(symbol="VK_API_FILE", optional=true)
    public static native String FILE();
    @GlobalValue(symbol="VK_API_TITLE", optional=true)
    public static native String TITLE();
    @GlobalValue(symbol="VK_API_TAGS", optional=true)
    public static native String TAGS();
    @GlobalValue(symbol="VK_API_PHOTO", optional=true)
    public static native String PHOTO();
    @GlobalValue(symbol="VK_API_ALBUM_ID", optional=true)
    public static native String ALBUM_ID();
    /*</methods>*/
}
