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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKAudio/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKAudioPtr extends Ptr<VKAudio, VKAudioPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKAudio.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKAudio() {}
    protected VKAudio(Handle h, long handle) { super(h, handle); }
    protected VKAudio(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native NSNumber getId();
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    @Property(selector = "owner_id")
    public native NSNumber getOwner_id();
    @Property(selector = "setOwner_id:")
    public native void setOwner_id(NSNumber v);
    @Property(selector = "artist")
    public native String getArtist();
    @Property(selector = "setArtist:")
    public native void setArtist(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "duration")
    public native NSNumber getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(NSNumber v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "lyrics_id")
    public native NSNumber getLyrics_id();
    @Property(selector = "setLyrics_id:")
    public native void setLyrics_id(NSNumber v);
    @Property(selector = "album_id")
    public native NSNumber getAlbum_id();
    @Property(selector = "setAlbum_id:")
    public native void setAlbum_id(NSNumber v);
    @Property(selector = "genre_id")
    public native NSNumber getGenre_id();
    @Property(selector = "setGenre_id:")
    public native void setGenre_id(NSNumber v);
    @Property(selector = "fromCache")
    public native boolean isFromCache();
    @Property(selector = "setFromCache:")
    public native void setFromCache(boolean v);
    @Property(selector = "ignoreCache")
    public native boolean isIgnoreCache();
    @Property(selector = "setIgnoreCache:")
    public native void setIgnoreCache(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
