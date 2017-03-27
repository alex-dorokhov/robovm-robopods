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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKSchool/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKSchoolPtr extends Ptr<VKSchool, VKSchoolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKSchool.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKSchool() {}
    protected VKSchool(Handle h, long handle) { super(h, handle); }
    protected VKSchool(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native NSNumber getId();
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    @Property(selector = "country")
    public native NSNumber getCountry();
    @Property(selector = "setCountry:")
    public native void setCountry(NSNumber v);
    @Property(selector = "city")
    public native NSNumber getCity();
    @Property(selector = "setCity:")
    public native void setCity(NSNumber v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "year_from")
    public native NSNumber getYear_from();
    @Property(selector = "setYear_from:")
    public native void setYear_from(NSNumber v);
    @Property(selector = "year_to")
    public native NSNumber getYear_to();
    @Property(selector = "setYear_to:")
    public native void setYear_to(NSNumber v);
    @Property(selector = "year_graduated")
    public native NSNumber getYear_graduated();
    @Property(selector = "setYear_graduated:")
    public native void setYear_graduated(NSNumber v);
    @Property(selector = "Mclass")
    public native String getMclass();
    @Property(selector = "setMclass:")
    public native void setMclass(String v);
    @Property(selector = "speciality")
    public native String getSpeciality();
    @Property(selector = "setSpeciality:")
    public native void setSpeciality(String v);
    @Property(selector = "type")
    public native NSNumber getType();
    @Property(selector = "setType:")
    public native void setType(NSNumber v);
    @Property(selector = "type_str")
    public native String getType_str();
    @Property(selector = "setType_str:")
    public native void setType_str(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
