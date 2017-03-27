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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKPhoto/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKPhotoPtr extends Ptr<VKPhoto, VKPhotoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKPhoto.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKPhoto() {}
    protected VKPhoto(Handle h, long handle) { super(h, handle); }
    protected VKPhoto(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native NSNumber getId();
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    @Property(selector = "album_id")
    public native NSNumber getAlbum_id();
    @Property(selector = "setAlbum_id:")
    public native void setAlbum_id(NSNumber v);
    @Property(selector = "owner_id")
    public native NSNumber getOwner_id();
    @Property(selector = "setOwner_id:")
    public native void setOwner_id(NSNumber v);
    @Property(selector = "photo_75")
    public native String getPhoto_75();
    @Property(selector = "setPhoto_75:")
    public native void setPhoto_75(String v);
    @Property(selector = "photo_130")
    public native String getPhoto_130();
    @Property(selector = "setPhoto_130:")
    public native void setPhoto_130(String v);
    @Property(selector = "photo_604")
    public native String getPhoto_604();
    @Property(selector = "setPhoto_604:")
    public native void setPhoto_604(String v);
    @Property(selector = "photo_807")
    public native String getPhoto_807();
    @Property(selector = "setPhoto_807:")
    public native void setPhoto_807(String v);
    @Property(selector = "photo_1280")
    public native String getPhoto_1280();
    @Property(selector = "setPhoto_1280:")
    public native void setPhoto_1280(String v);
    @Property(selector = "photo_2560")
    public native String getPhoto_2560();
    @Property(selector = "setPhoto_2560:")
    public native void setPhoto_2560(String v);
    @Property(selector = "width")
    public native NSNumber getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(NSNumber v);
    @Property(selector = "height")
    public native NSNumber getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(NSNumber v);
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "date")
    public native NSNumber getDate();
    @Property(selector = "setDate:")
    public native void setDate(NSNumber v);
    @Property(selector = "sizes")
    public native VKPhotoSizes getSizes();
    @Property(selector = "setSizes:")
    public native void setSizes(VKPhotoSizes v);
    @Property(selector = "attachmentString")
    public native String getAttachmentString();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
