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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKUniversity/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKUniversityPtr extends Ptr<VKUniversity, VKUniversityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKUniversity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKUniversity() {}
    protected VKUniversity(Handle h, long handle) { super(h, handle); }
    protected VKUniversity(SkipInit skipInit) { super(skipInit); }
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
    @Property(selector = "faculty")
    public native NSNumber getFaculty();
    @Property(selector = "setFaculty:")
    public native void setFaculty(NSNumber v);
    @Property(selector = "faculty_name")
    public native String getFaculty_name();
    @Property(selector = "setFaculty_name:")
    public native void setFaculty_name(String v);
    @Property(selector = "chair")
    public native NSNumber getChair();
    @Property(selector = "setChair:")
    public native void setChair(NSNumber v);
    @Property(selector = "chair_name")
    public native String getChair_name();
    @Property(selector = "setChair_name:")
    public native void setChair_name(String v);
    @Property(selector = "graduation")
    public native NSNumber getGraduation();
    @Property(selector = "setGraduation:")
    public native void setGraduation(NSNumber v);
    @Property(selector = "education_form")
    public native String getEducation_form();
    @Property(selector = "setEducation_form:")
    public native void setEducation_form(String v);
    @Property(selector = "education_status")
    public native String getEducation_status();
    @Property(selector = "setEducation_status:")
    public native void setEducation_status(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
