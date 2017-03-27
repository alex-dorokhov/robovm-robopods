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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKRequestTiming/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKRequestTimingPtr extends Ptr<VKRequestTiming, VKRequestTimingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKRequestTiming.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKRequestTiming() {}
    protected VKRequestTiming(Handle h, long handle) { super(h, handle); }
    protected VKRequestTiming(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startTime")
    public native NSDate getStartTime();
    @Property(selector = "setStartTime:")
    public native void setStartTime(NSDate v);
    @Property(selector = "finishTime")
    public native NSDate getFinishTime();
    @Property(selector = "setFinishTime:")
    public native void setFinishTime(NSDate v);
    @Property(selector = "loadTime")
    public native double getLoadTime();
    @Property(selector = "setLoadTime:")
    public native void setLoadTime(double v);
    @Property(selector = "parseTime")
    public native double getParseTime();
    @Property(selector = "setParseTime:")
    public native void setParseTime(double v);
    @Property(selector = "totalTime")
    public native double getTotalTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
