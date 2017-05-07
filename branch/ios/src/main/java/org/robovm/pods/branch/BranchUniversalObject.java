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
package org.robovm.pods.branch;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchUniversalObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchUniversalObjectPtr extends Ptr<BranchUniversalObject, BranchUniversalObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchUniversalObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchUniversalObject() {}
    protected BranchUniversalObject(Handle h, long handle) { super(h, handle); }
    protected BranchUniversalObject(SkipInit skipInit) { super(skipInit); }
    public BranchUniversalObject(String canonicalIdentifier) { super((SkipInit) null); initObject(initWithCanonicalIdentifier(canonicalIdentifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canonicalIdentifier")
    public native String getCanonicalIdentifier();
    @Property(selector = "setCanonicalIdentifier:")
    public native void setCanonicalIdentifier(String v);
    @Property(selector = "canonicalUrl")
    public native String getCanonicalUrl();
    @Property(selector = "setCanonicalUrl:")
    public native void setCanonicalUrl(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "contentDescription")
    public native String getContentDescription();
    @Property(selector = "setContentDescription:")
    public native void setContentDescription(String v);
    @Property(selector = "imageUrl")
    public native String getImageUrl();
    @Property(selector = "setImageUrl:")
    public native void setImageUrl(String v);
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSDictionary<?, ?> v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "contentIndexMode")
    public native ContentIndexMode getContentIndexMode();
    @Property(selector = "setContentIndexMode:")
    public native void setContentIndexMode(ContentIndexMode v);
    @Property(selector = "keywords")
    public native NSArray<?> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<?> v);
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "setExpirationDate:")
    public native void setExpirationDate(NSDate v);
    @Property(selector = "spotlightIdentifier")
    public native String getSpotlightIdentifier();
    @Property(selector = "setSpotlightIdentifier:")
    public native void setSpotlightIdentifier(String v);
    @Property(selector = "price")
    public native double getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(double v);
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "setCurrency:")
    public native void setCurrency(String v);
    @Property(selector = "automaticallyListOnSpotlight")
    public native boolean automaticallyListOnSpotlight();
    @Property(selector = "setAutomaticallyListOnSpotlight:")
    public native void setAutomaticallyListOnSpotlight(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCanonicalIdentifier:")
    protected native @Pointer long initWithCanonicalIdentifier(String canonicalIdentifier);
    @Method(selector = "addMetadataKey:value:")
    public native void addMetadataKey(String key, String value);
    @Method(selector = "registerView")
    public native void registerView();
    @Method(selector = "registerViewWithCallback:")
    public native void registerViewWithCallback(@Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "userCompletedAction:")
    public native void userCompletedAction(String action);
    @Method(selector = "userCompletedAction:withState:")
    public native void userCompletedAction(String action, NSDictionary<?, ?> state);
    @Method(selector = "getShortUrlWithLinkProperties:")
    public native String getShortUrlWithLinkProperties(BranchLinkProperties linkProperties);
    @Method(selector = "getShortUrlWithLinkPropertiesAndIgnoreFirstClick:")
    public native String getShortUrlWithLinkPropertiesAndIgnoreFirstClick(BranchLinkProperties linkProperties);
    @Method(selector = "getShortUrlWithLinkProperties:andCallback:")
    public native void getShortUrlWithLinkProperties(BranchLinkProperties linkProperties, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getBranchActivityItemWithLinkProperties:")
    public native UIActivityItemProvider getBranchActivityItemWithLinkProperties(BranchLinkProperties linkProperties);
    @Method(selector = "showShareSheetWithShareText:completion:")
    public native void showShareSheetWithShareText(String shareText, @Block VoidBlock2<NSString, Boolean> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:completion:")
    public native void showShareSheetWithLinkProperties(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, @Block VoidBlock2<NSString, Boolean> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:completionWithError:")
    public native void showShareSheetWithLinkProperties(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, @Block VoidBlock3<NSString, Boolean, NSError> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:anchor:completion:")
    public native void showShareSheetWithLinkProperties(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, UIBarButtonItem anchor, @Block VoidBlock2<NSString, Boolean> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:anchor:completionWithError:")
    public native void showShareSheetWithLinkProperties(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, UIBarButtonItem anchor, @Block VoidBlock3<NSString, Boolean, NSError> completion);
    @Method(selector = "listOnSpotlight")
    public native void listOnSpotlight();
    @Method(selector = "listOnSpotlightWithCallback:")
    public native void listOnSpotlightWithCallback(@Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "listOnSpotlightWithIdentifierCallback:")
    public native void listOnSpotlightWithIdentifierCallback(@Block VoidBlock3<NSString, NSString, NSError> spotlightCallback);
    @Method(selector = "description")
    public native String description();
    @Method(selector = "getDictionaryWithCompleteLinkProperties:")
    public native NSDictionary<?, ?> getDictionaryWithCompleteLinkProperties(BranchLinkProperties linkProperties);
    @Method(selector = "getParamsForServerRequestWithAddedLinkProperties:")
    public native NSDictionary<?, ?> getParamsForServerRequestWithAddedLinkProperties(BranchLinkProperties linkProperties);
    @Method(selector = "getBranchUniversalObjectFromDictionary:")
    public static native BranchUniversalObject getBranchUniversalObjectFromDictionary(NSDictionary<?, ?> dictionary);
    /*</methods>*/
}
