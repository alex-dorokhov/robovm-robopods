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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKImageParameters/*</name>*/ 
    extends /*<extends>*/VKObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKImageParametersPtr extends Ptr<VKImageParameters, VKImageParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKImageParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKImageParameters() {}
    protected VKImageParameters(Handle h, long handle) { super(h, handle); }
    protected VKImageParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "imageType")
    public native VKImageType getImageType();
    @Property(selector = "setImageType:", strongRef = true)
    public native void setImageType(VKImageType v);
    @Property(selector = "jpegQuality")
    public native @MachineSizedFloat double getJpegQuality();
    @Property(selector = "setJpegQuality:")
    public native void setJpegQuality(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fileExtension")
    public native String fileExtension();
    @Method(selector = "mimeType")
    public native String mimeType();
    @Method(selector = "pngImage")
    public static native VKImageParameters pngImage();
    @Method(selector = "jpegImageWithQuality:")
    public static native VKImageParameters jpegImageWithQuality(float quality);
    /*</methods>*/
}
