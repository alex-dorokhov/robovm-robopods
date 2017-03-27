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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKCounters/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKCountersPtr extends Ptr<VKCounters, VKCountersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKCounters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKCounters() {}
    protected VKCounters(Handle h, long handle) { super(h, handle); }
    protected VKCounters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "friends")
    public native NSNumber getFriends();
    @Property(selector = "setFriends:")
    public native void setFriends(NSNumber v);
    @Property(selector = "messages")
    public native NSNumber getMessages();
    @Property(selector = "setMessages:")
    public native void setMessages(NSNumber v);
    @Property(selector = "photos")
    public native NSNumber getPhotos();
    @Property(selector = "setPhotos:")
    public native void setPhotos(NSNumber v);
    @Property(selector = "videos")
    public native NSNumber getVideos();
    @Property(selector = "setVideos:")
    public native void setVideos(NSNumber v);
    @Property(selector = "notifications")
    public native NSNumber getNotifications();
    @Property(selector = "setNotifications:")
    public native void setNotifications(NSNumber v);
    @Property(selector = "groups")
    public native NSNumber getGroups();
    @Property(selector = "setGroups:")
    public native void setGroups(NSNumber v);
    @Property(selector = "gifts")
    public native NSNumber getGifts();
    @Property(selector = "setGifts:")
    public native void setGifts(NSNumber v);
    @Property(selector = "events")
    public native NSNumber getEvents();
    @Property(selector = "setEvents:")
    public native void setEvents(NSNumber v);
    @Property(selector = "albums")
    public native NSNumber getAlbums();
    @Property(selector = "setAlbums:")
    public native void setAlbums(NSNumber v);
    @Property(selector = "audios")
    public native NSNumber getAudios();
    @Property(selector = "setAudios:")
    public native void setAudios(NSNumber v);
    @Property(selector = "online_friends")
    public native NSNumber getOnline_friends();
    @Property(selector = "setOnline_friends:")
    public native void setOnline_friends(NSNumber v);
    @Property(selector = "mutual_friends")
    public native NSNumber getMutual_friends();
    @Property(selector = "setMutual_friends:")
    public native void setMutual_friends(NSNumber v);
    @Property(selector = "user_videos")
    public native NSNumber getUser_videos();
    @Property(selector = "setUser_videos:")
    public native void setUser_videos(NSNumber v);
    @Property(selector = "followers")
    public native NSNumber getFollowers();
    @Property(selector = "setFollowers:")
    public native void setFollowers(NSNumber v);
    @Property(selector = "user_photos")
    public native NSNumber getUser_photos();
    @Property(selector = "setUser_photos:")
    public native void setUser_photos(NSNumber v);
    @Property(selector = "subscriptions")
    public native NSNumber getSubscriptions();
    @Property(selector = "setSubscriptions:")
    public native void setSubscriptions(NSNumber v);
    @Property(selector = "documents")
    public native NSNumber getDocuments();
    @Property(selector = "setDocuments:")
    public native void setDocuments(NSNumber v);
    @Property(selector = "topics")
    public native NSNumber getTopics();
    @Property(selector = "setTopics:")
    public native void setTopics(NSNumber v);
    @Property(selector = "pages")
    public native NSNumber getPages();
    @Property(selector = "setPages:")
    public native void setPages(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
