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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKPersonal/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKPersonalPtr extends Ptr<VKPersonal, VKPersonalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKPersonal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKPersonal() {}
    protected VKPersonal(Handle h, long handle) { super(h, handle); }
    protected VKPersonal(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "langs")
    public native NSArray<?> getLangs();
    @Property(selector = "setLangs:")
    public native void setLangs(NSArray<?> v);
    @Property(selector = "political")
    public native NSNumber getPolitical();
    @Property(selector = "setPolitical:")
    public native void setPolitical(NSNumber v);
    @Property(selector = "religion")
    public native String getReligion();
    @Property(selector = "setReligion:")
    public native void setReligion(String v);
    @Property(selector = "life_main")
    public native NSNumber getLife_main();
    @Property(selector = "setLife_main:")
    public native void setLife_main(NSNumber v);
    @Property(selector = "people_main")
    public native NSNumber getPeople_main();
    @Property(selector = "setPeople_main:")
    public native void setPeople_main(NSNumber v);
    @Property(selector = "inspired_by")
    public native String getInspired_by();
    @Property(selector = "setInspired_by:")
    public native void setInspired_by(String v);
    @Property(selector = "smoking")
    public native NSNumber getSmoking();
    @Property(selector = "setSmoking:")
    public native void setSmoking(NSNumber v);
    @Property(selector = "alcohol")
    public native NSNumber getAlcohol();
    @Property(selector = "setAlcohol:")
    public native void setAlcohol(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
