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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(VKConstants.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="VK_DISPLAY_IOS", optional=true)
    public static native String VK_DISPLAY_IOS();
    @GlobalValue(symbol="VK_DISPLAY_MOBILE", optional=true)
    public static native String VK_DISPLAY_MOBILE();
    @GlobalValue(symbol="VK_ORIGINAL_CLIENT_BUNDLE", optional=true)
    public static native String VK_ORIGINAL_CLIENT_BUNDLE();
    @GlobalValue(symbol="VK_ORIGINAL_HD_CLIENT_BUNDLE", optional=true)
    public static native String VK_ORIGINAL_HD_CLIENT_BUNDLE();
    @GlobalValue(symbol="VK_DEBUG_CLIENT_BUNDLE", optional=true)
    public static native String VK_DEBUG_CLIENT_BUNDLE();
    @GlobalValue(symbol="VK_PER_NOTIFY", optional=true)
    public static native String VK_PER_NOTIFY();
    @GlobalValue(symbol="VK_PER_FRIENDS", optional=true)
    public static native String VK_PER_FRIENDS();
    @GlobalValue(symbol="VK_PER_PHOTOS", optional=true)
    public static native String VK_PER_PHOTOS();
    @GlobalValue(symbol="VK_PER_AUDIO", optional=true)
    public static native String VK_PER_AUDIO();
    @GlobalValue(symbol="VK_PER_VIDEO", optional=true)
    public static native String VK_PER_VIDEO();
    @GlobalValue(symbol="VK_PER_DOCS", optional=true)
    public static native String VK_PER_DOCS();
    @GlobalValue(symbol="VK_PER_NOTES", optional=true)
    public static native String VK_PER_NOTES();
    @GlobalValue(symbol="VK_PER_PAGES", optional=true)
    public static native String VK_PER_PAGES();
    @GlobalValue(symbol="VK_PER_STATUS", optional=true)
    public static native String VK_PER_STATUS();
    @GlobalValue(symbol="VK_PER_WALL", optional=true)
    public static native String VK_PER_WALL();
    @GlobalValue(symbol="VK_PER_GROUPS", optional=true)
    public static native String VK_PER_GROUPS();
    @GlobalValue(symbol="VK_PER_MESSAGES", optional=true)
    public static native String VK_PER_MESSAGES();
    @GlobalValue(symbol="VK_PER_NOTIFICATIONS", optional=true)
    public static native String VK_PER_NOTIFICATIONS();
    @GlobalValue(symbol="VK_PER_STATS", optional=true)
    public static native String VK_PER_STATS();
    @GlobalValue(symbol="VK_PER_ADS", optional=true)
    public static native String VK_PER_ADS();
    @GlobalValue(symbol="VK_PER_OFFLINE", optional=true)
    public static native String VK_PER_OFFLINE();
    @GlobalValue(symbol="VK_PER_NOHTTPS", optional=true)
    public static native String VK_PER_NOHTTPS();
    @GlobalValue(symbol="VK_PER_EMAIL", optional=true)
    public static native String VK_PER_EMAIL();
    @GlobalValue(symbol="VK_PER_MARKET", optional=true)
    public static native String VK_PER_MARKET();
    /*</methods>*/
}
