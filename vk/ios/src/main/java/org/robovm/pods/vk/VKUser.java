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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKUser/*</name>*/ 
    extends /*<extends>*/VKApiObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VKUserPtr extends Ptr<VKUser, VKUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKUser() {}
    protected VKUser(Handle h, long handle) { super(h, handle); }
    protected VKUser(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native NSNumber getId();
    @Property(selector = "setId:")
    public native void setId(NSNumber v);
    @Property(selector = "first_name")
    public native String getFirst_name();
    @Property(selector = "setFirst_name:")
    public native void setFirst_name(String v);
    @Property(selector = "last_name")
    public native String getLast_name();
    @Property(selector = "setLast_name:")
    public native void setLast_name(String v);
    @Property(selector = "first_name_acc")
    public native String getFirst_name_acc();
    @Property(selector = "setFirst_name_acc:")
    public native void setFirst_name_acc(String v);
    @Property(selector = "last_name_acc")
    public native String getLast_name_acc();
    @Property(selector = "setLast_name_acc:")
    public native void setLast_name_acc(String v);
    @Property(selector = "first_name_gen")
    public native String getFirst_name_gen();
    @Property(selector = "setFirst_name_gen:")
    public native void setFirst_name_gen(String v);
    @Property(selector = "last_name_gen")
    public native String getLast_name_gen();
    @Property(selector = "setLast_name_gen:")
    public native void setLast_name_gen(String v);
    @Property(selector = "first_name_dat")
    public native String getFirst_name_dat();
    @Property(selector = "setFirst_name_dat:")
    public native void setFirst_name_dat(String v);
    @Property(selector = "last_name_dat")
    public native String getLast_name_dat();
    @Property(selector = "setLast_name_dat:")
    public native void setLast_name_dat(String v);
    @Property(selector = "first_name_ins")
    public native String getFirst_name_ins();
    @Property(selector = "setFirst_name_ins:")
    public native void setFirst_name_ins(String v);
    @Property(selector = "last_name_ins")
    public native String getLast_name_ins();
    @Property(selector = "setLast_name_ins:")
    public native void setLast_name_ins(String v);
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "setDomain:")
    public native void setDomain(String v);
    @Property(selector = "personal")
    public native VKPersonal getPersonal();
    @Property(selector = "setPersonal:")
    public native void setPersonal(VKPersonal v);
    @Property(selector = "sex")
    public native NSNumber getSex();
    @Property(selector = "setSex:")
    public native void setSex(NSNumber v);
    @Property(selector = "invited_by")
    public native NSNumber getInvited_by();
    @Property(selector = "setInvited_by:")
    public native void setInvited_by(NSNumber v);
    @Property(selector = "online")
    public native NSNumber getOnline();
    @Property(selector = "setOnline:")
    public native void setOnline(NSNumber v);
    @Property(selector = "bdate")
    public native String getBdate();
    @Property(selector = "setBdate:")
    public native void setBdate(String v);
    @Property(selector = "city")
    public native VKCity getCity();
    @Property(selector = "setCity:")
    public native void setCity(VKCity v);
    @Property(selector = "country")
    public native VKCountry getCountry();
    @Property(selector = "setCountry:")
    public native void setCountry(VKCountry v);
    @Property(selector = "lists")
    public native NSMutableArray<?> getLists();
    @Property(selector = "setLists:")
    public native void setLists(NSMutableArray<?> v);
    @Property(selector = "screen_name")
    public native String getScreen_name();
    @Property(selector = "setScreen_name:")
    public native void setScreen_name(String v);
    @Property(selector = "has_mobile")
    public native NSNumber getHas_mobile();
    @Property(selector = "setHas_mobile:")
    public native void setHas_mobile(NSNumber v);
    @Property(selector = "rate")
    public native NSNumber getRate();
    @Property(selector = "setRate:")
    public native void setRate(NSNumber v);
    @Property(selector = "mobile_phone")
    public native String getMobile_phone();
    @Property(selector = "setMobile_phone:")
    public native void setMobile_phone(String v);
    @Property(selector = "home_phone")
    public native String getHome_phone();
    @Property(selector = "setHome_phone:")
    public native void setHome_phone(String v);
    @Property(selector = "can_post")
    public native boolean isCan_post();
    @Property(selector = "setCan_post:")
    public native void setCan_post(boolean v);
    @Property(selector = "can_see_all_posts")
    public native boolean isCan_see_all_posts();
    @Property(selector = "setCan_see_all_posts:")
    public native void setCan_see_all_posts(boolean v);
    @Property(selector = "status")
    public native String getStatus();
    @Property(selector = "setStatus:")
    public native void setStatus(String v);
    @Property(selector = "status_audio")
    public native VKAudio getStatus_audio();
    @Property(selector = "setStatus_audio:")
    public native void setStatus_audio(VKAudio v);
    @Property(selector = "status_loaded")
    public native boolean isStatus_loaded();
    @Property(selector = "setStatus_loaded:")
    public native void setStatus_loaded(boolean v);
    @Property(selector = "last_seen")
    public native VKLastSeen getLast_seen();
    @Property(selector = "setLast_seen:")
    public native void setLast_seen(VKLastSeen v);
    @Property(selector = "relation")
    public native NSNumber getRelation();
    @Property(selector = "setRelation:")
    public native void setRelation(NSNumber v);
    @Property(selector = "relation_partner")
    public native VKUser getRelation_partner();
    @Property(selector = "setRelation_partner:")
    public native void setRelation_partner(VKUser v);
    @Property(selector = "counters")
    public native VKCounters getCounters();
    @Property(selector = "setCounters:")
    public native void setCounters(VKCounters v);
    @Property(selector = "nickname")
    public native String getNickname();
    @Property(selector = "setNickname:")
    public native void setNickname(String v);
    @Property(selector = "exports")
    public native VKExports getExports();
    @Property(selector = "setExports:")
    public native void setExports(VKExports v);
    @Property(selector = "wall_comments")
    public native NSNumber getWall_comments();
    @Property(selector = "setWall_comments:")
    public native void setWall_comments(NSNumber v);
    @Property(selector = "can_write_private_message")
    public native boolean isCan_write_private_message();
    @Property(selector = "setCan_write_private_message:")
    public native void setCan_write_private_message(boolean v);
    @Property(selector = "can_see_audio")
    public native boolean isCan_see_audio();
    @Property(selector = "setCan_see_audio:")
    public native void setCan_see_audio(boolean v);
    @Property(selector = "phone")
    public native String getPhone();
    @Property(selector = "setPhone:")
    public native void setPhone(String v);
    @Property(selector = "online_mobile")
    public native NSNumber getOnline_mobile();
    @Property(selector = "setOnline_mobile:")
    public native void setOnline_mobile(NSNumber v);
    @Property(selector = "faculty")
    public native NSNumber getFaculty();
    @Property(selector = "setFaculty:")
    public native void setFaculty(NSNumber v);
    @Property(selector = "university")
    public native NSNumber getUniversity();
    @Property(selector = "setUniversity:")
    public native void setUniversity(NSNumber v);
    @Property(selector = "universities")
    public native VKUniversities getUniversities();
    @Property(selector = "setUniversities:")
    public native void setUniversities(VKUniversities v);
    @Property(selector = "schools")
    public native VKSchools getSchools();
    @Property(selector = "setSchools:")
    public native void setSchools(VKSchools v);
    @Property(selector = "graduation")
    public native NSNumber getGraduation();
    @Property(selector = "setGraduation:")
    public native void setGraduation(NSNumber v);
    @Property(selector = "friendState")
    public native NSNumber getFriendState();
    @Property(selector = "setFriendState:")
    public native void setFriendState(NSNumber v);
    @Property(selector = "common_count")
    public native NSNumber getCommon_count();
    @Property(selector = "setCommon_count:")
    public native void setCommon_count(NSNumber v);
    @Property(selector = "faculty_name")
    public native String getFaculty_name();
    @Property(selector = "setFaculty_name:")
    public native void setFaculty_name(String v);
    @Property(selector = "university_name")
    public native String getUniversity_name();
    @Property(selector = "setUniversity_name:")
    public native void setUniversity_name(String v);
    @Property(selector = "books")
    public native String getBooks();
    @Property(selector = "setBooks:")
    public native void setBooks(String v);
    @Property(selector = "games")
    public native String getGames();
    @Property(selector = "setGames:")
    public native void setGames(String v);
    @Property(selector = "interests")
    public native String getInterests();
    @Property(selector = "setInterests:")
    public native void setInterests(String v);
    @Property(selector = "movies")
    public native String getMovies();
    @Property(selector = "setMovies:")
    public native void setMovies(String v);
    @Property(selector = "tv")
    public native String getTv();
    @Property(selector = "setTv:")
    public native void setTv(String v);
    @Property(selector = "about")
    public native String getAbout();
    @Property(selector = "setAbout:")
    public native void setAbout(String v);
    @Property(selector = "music")
    public native String getMusic();
    @Property(selector = "setMusic:")
    public native void setMusic(String v);
    @Property(selector = "quoutes")
    public native String getQuoutes();
    @Property(selector = "setQuoutes:")
    public native void setQuoutes(String v);
    @Property(selector = "activities")
    public native String getActivities();
    @Property(selector = "setActivities:")
    public native void setActivities(String v);
    @Property(selector = "photo_max")
    public native String getPhoto_max();
    @Property(selector = "setPhoto_max:")
    public native void setPhoto_max(String v);
    @Property(selector = "photo_50")
    public native String getPhoto_50();
    @Property(selector = "setPhoto_50:")
    public native void setPhoto_50(String v);
    @Property(selector = "photo_100")
    public native String getPhoto_100();
    @Property(selector = "setPhoto_100:")
    public native void setPhoto_100(String v);
    @Property(selector = "photo_200")
    public native String getPhoto_200();
    @Property(selector = "setPhoto_200:")
    public native void setPhoto_200(String v);
    @Property(selector = "photo_200_orig")
    public native String getPhoto_200_orig();
    @Property(selector = "setPhoto_200_orig:")
    public native void setPhoto_200_orig(String v);
    @Property(selector = "photo_400_orig")
    public native String getPhoto_400_orig();
    @Property(selector = "setPhoto_400_orig:")
    public native void setPhoto_400_orig(String v);
    @Property(selector = "photo_max_orig")
    public native String getPhoto_max_orig();
    @Property(selector = "setPhoto_max_orig:")
    public native void setPhoto_max_orig(String v);
    @Property(selector = "photos")
    public native VKPhotoArray getPhotos();
    @Property(selector = "setPhotos:")
    public native void setPhotos(VKPhotoArray v);
    @Property(selector = "photos_count")
    public native NSNumber getPhotos_count();
    @Property(selector = "setPhotos_count:")
    public native void setPhotos_count(NSNumber v);
    @Property(selector = "relatives")
    public native VKRelativities getRelatives();
    @Property(selector = "setRelatives:")
    public native void setRelatives(VKRelativities v);
    @Property(selector = "bdateIntervalSort")
    public native double getBdateIntervalSort();
    @Property(selector = "setBdateIntervalSort:")
    public native void setBdateIntervalSort(double v);
    @Property(selector = "verified")
    public native NSNumber getVerified();
    @Property(selector = "setVerified:")
    public native void setVerified(NSNumber v);
    @Property(selector = "deactivated")
    public native String getDeactivated();
    @Property(selector = "setDeactivated:")
    public native void setDeactivated(String v);
    @Property(selector = "site")
    public native String getSite();
    @Property(selector = "setSite:")
    public native void setSite(String v);
    @Property(selector = "home_town")
    public native String getHome_town();
    @Property(selector = "setHome_town:")
    public native void setHome_town(String v);
    @Property(selector = "blacklisted")
    public native NSNumber getBlacklisted();
    @Property(selector = "setBlacklisted:")
    public native void setBlacklisted(NSNumber v);
    @Property(selector = "blacklisted_by_me")
    public native NSNumber getBlacklisted_by_me();
    @Property(selector = "setBlacklisted_by_me:")
    public native void setBlacklisted_by_me(NSNumber v);
    @Property(selector = "twitter")
    public native String getTwitter();
    @Property(selector = "setTwitter:")
    public native void setTwitter(String v);
    @Property(selector = "skype")
    public native String getSkype();
    @Property(selector = "setSkype:")
    public native void setSkype(String v);
    @Property(selector = "facebook")
    public native String getFacebook();
    @Property(selector = "setFacebook:")
    public native void setFacebook(String v);
    @Property(selector = "instagram")
    public native String getInstagram();
    @Property(selector = "setInstagram:")
    public native void setInstagram(String v);
    @Property(selector = "livejournal")
    public native String getLivejournal();
    @Property(selector = "setLivejournal:")
    public native void setLivejournal(String v);
    @Property(selector = "wall_default")
    public native String getWall_default();
    @Property(selector = "setWall_default:")
    public native void setWall_default(String v);
    @Property(selector = "followers_count")
    public native NSNumber getFollowers_count();
    @Property(selector = "setFollowers_count:")
    public native void setFollowers_count(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
