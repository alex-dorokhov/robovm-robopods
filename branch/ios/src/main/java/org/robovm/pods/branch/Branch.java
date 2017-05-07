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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Branch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchPtr extends Ptr<Branch, BranchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Branch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Branch() {}
    protected Branch(Handle h, long handle) { super(h, handle); }
    protected Branch(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initSessionWithLaunchOptions:")
    public native void initSession(NSDictionary<?, ?> options);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:")
    public native void initSession(NSDictionary<?, ?> options, boolean isReferrable);
    @Method(selector = "initSessionWithLaunchOptions:andRegisterDeepLinkHandler:")
    public native void initSession(NSDictionary<?, ?> options, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:andRegisterDeepLinkHandlerUsingBranchUniversalObject:")
    public native void initSession(NSDictionary<?, ?> options, @Block VoidBlock3<BranchUniversalObject, BranchLinkProperties, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:")
    public native void initSessionAndAutomaticallyDisplayDeepLinkController(NSDictionary<?, ?> options, boolean automaticallyDisplayController);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:andRegisterDeepLinkHandler:")
    public native void initSession(NSDictionary<?, ?> options, boolean isReferrable, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:isReferrable:automaticallyDisplayDeepLinkController:")
    public native void initSessionAndAutomaticallyDisplayDeepLinkController(NSDictionary<?, ?> options, boolean isReferrable, boolean automaticallyDisplayController);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:deepLinkHandler:")
    public native void initSessionAndAutomaticallyDisplayDeepLinkController(NSDictionary<?, ?> options, boolean automaticallyDisplayController, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "initSessionWithLaunchOptions:automaticallyDisplayDeepLinkController:isReferrable:deepLinkHandler:")
    public native void initSessionAndAutomaticallyDisplayDeepLinkController(NSDictionary<?, ?> options, boolean automaticallyDisplayController, boolean isReferrable, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "handleDeepLink:")
    public native boolean handleDeepLink(NSURL url);
    @Method(selector = "continueUserActivity:")
    public native boolean continueUserActivity(NSUserActivity userActivity);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean application(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "application:openURL:options:")
    public native boolean application(UIApplication application, NSURL url, NSDictionary<?, ?> options);
    @Method(selector = "handlePushNotification:")
    public native void handlePushNotification(NSDictionary<?, ?> userInfo);
    @Method(selector = "registerDeepLinkController:forKey:")
    public native void registerDeepLinkController(UIViewController controller, String key);
    @Method(selector = "setDebug")
    public native void setDebug();
    @Method(selector = "setDeepLinkDebugMode:")
    public native void setDeepLinkDebugMode(NSDictionary<?, ?> debugParams);
    @Method(selector = "addWhiteListedScheme:")
    public native void addWhiteListedScheme(String scheme);
    @Method(selector = "setWhiteListedSchemes:")
    public native void setWhiteListedSchemes(NSArray<?> schemes);
    @Method(selector = "registerFacebookDeepLinkingClass:")
    public native void registerFacebookDeepLinkingClass(NSObject FBSDKAppLinkUtility);
    @Method(selector = "delayInitToCheckForSearchAds")
    public native void delayInitToCheckForSearchAds();
    @Method(selector = "setAppleSearchAdsDebugMode")
    public native void setAppleSearchAdsDebugMode();
    @Method(selector = "setRetryInterval:")
    public native void setRetryInterval(double retryInterval);
    @Method(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long maxRetries);
    @Method(selector = "setNetworkTimeout:")
    public native void setNetworkTimeout(double timeout);
    @Method(selector = "disableCookieBasedMatching")
    public native void disableCookieBasedMatching();
    @Method(selector = "accountForFacebookSDKPreventingAppLaunch")
    public native void accountForFacebookSDKPreventingAppLaunch();
    @Method(selector = "suppressWarningLogs")
    public native void suppressWarningLogs();
    @Method(selector = "setRequestMetadataKey:value:")
    public native void setRequestMetadataKey(String key, NSObject value);
    @Method(selector = "enableDelayedInit")
    public native void enableDelayedInit();
    @Method(selector = "disableDelayedInit")
    public native void disableDelayedInit();
    @Method(selector = "getUrlForOnboardingWithRedirectUrl:")
    public native NSURL getUrlForOnboardingWithRedirectUrl(String redirectUrl);
    @Method(selector = "resumeInit")
    public native void resumeInit();
    @Method(selector = "setInstallRequestDelay:")
    public native void setInstallRequestDelay(@MachineSizedSInt long installRequestDelay);
    @Method(selector = "getFirstReferringBranchUniversalObject")
    public native BranchUniversalObject getFirstReferringBranchUniversalObject();
    @Method(selector = "getFirstReferringBranchLinkProperties")
    public native BranchLinkProperties getFirstReferringBranchLinkProperties();
    @Method(selector = "getFirstReferringParams")
    public native NSDictionary<?, ?> getFirstReferringParams();
    @Method(selector = "getLatestReferringBranchUniversalObject")
    public native BranchUniversalObject getLatestReferringBranchUniversalObject();
    @Method(selector = "getLatestReferringBranchLinkProperties")
    public native BranchLinkProperties getLatestReferringBranchLinkProperties();
    @Method(selector = "getLatestReferringParams")
    public native NSDictionary<?, ?> getLatestReferringParams();
    @Method(selector = "getLatestReferringParamsSynchronous")
    public native NSDictionary<?, ?> getLatestReferringParamsSynchronous();
    @Method(selector = "resetUserSession")
    public native void resetUserSession();
    @Method(selector = "isUserIdentified")
    public native boolean isUserIdentified();
    @Method(selector = "setIdentity:")
    public native void setIdentity(String userId);
    @Method(selector = "setIdentity:withCallback:")
    public native void setIdentity(String userId, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "logout")
    public native void logout();
    @Method(selector = "logoutWithCallback:")
    public native void logoutWithCallback(@Block VoidBlock2<Boolean, NSError> callback);
    @Method(selector = "loadRewardsWithCallback:")
    public native void loadRewardsWithCallback(@Block VoidBlock2<Boolean, NSError> callback);
    @Method(selector = "redeemRewards:")
    public native void redeemRewards(@MachineSizedSInt long count);
    @Method(selector = "redeemRewards:callback:")
    public native void redeemRewards(@MachineSizedSInt long count, @Block VoidBlock2<Boolean, NSError> callback);
    @Method(selector = "redeemRewards:forBucket:")
    public native void redeemRewards(@MachineSizedSInt long count, String bucket);
    @Method(selector = "redeemRewards:forBucket:callback:")
    public native void redeemRewards(@MachineSizedSInt long count, String bucket, @Block VoidBlock2<Boolean, NSError> callback);
    @Method(selector = "getCredits")
    public native @MachineSizedSInt long getCredits();
    @Method(selector = "getCreditsForBucket:")
    public native @MachineSizedSInt long getCreditsForBucket(String bucket);
    @Method(selector = "getCreditHistoryWithCallback:")
    public native void getCreditHistoryWithCallback(@Block VoidBlock2<NSArray<?>, NSError> callback);
    @Method(selector = "getCreditHistoryForBucket:andCallback:")
    public native void getCreditHistoryForBucket(String bucket, @Block VoidBlock2<NSArray<?>, NSError> callback);
    @Method(selector = "getCreditHistoryAfter:number:order:andCallback:")
    public native void getCreditHistoryAfter(String creditTransactionId, @MachineSizedSInt long length, BranchCreditHistoryOrder order, @Block VoidBlock2<NSArray<?>, NSError> callback);
    @Method(selector = "getCreditHistoryForBucket:after:number:order:andCallback:")
    public native void getCreditHistoryForBucket(String bucket, String creditTransactionId, @MachineSizedSInt long length, BranchCreditHistoryOrder order, @Block VoidBlock2<NSArray<?>, NSError> callback);
    @Method(selector = "userCompletedAction:")
    public native void userCompletedAction(String action);
    @Method(selector = "userCompletedAction:withState:")
    public native void userCompletedAction(String action, NSDictionary<?, ?> state);
    @Method(selector = "userCompletedAction:withState:withDelegate:")
    public native void userCompletedAction(String action, NSDictionary<?, ?> state, NSObject branchViewCallback);
    @Method(selector = "sendCommerceEvent:metadata:withCompletion:")
    public native void sendCommerceEvent(BNCCommerceEvent commerceEvent, NSDictionary<?, ?> metadata, @Block VoidBlock2<NSDictionary<?, ?>, NSError> completion);
    @Method(selector = "getShortURL")
    public native String getShortURL();
    @Method(selector = "getShortURLWithParams:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andAlias:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andType:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, BranchLinkType type);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:ignoreUAString:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias, String ignoreUAString);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andCampaign:andAlias:ignoreUAString:forceLinkCreation:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String campaign, String alias, String ignoreUAString, boolean forceLinkCreation);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andType:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, BranchLinkType type);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andChannel:andFeature:andStage:andMatchDuration:")
    public native String getShortUrlWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String alias, String channel, String feature, String stage, @MachineSizedUInt long duration);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andChannel:andFeature:andStage:andCampaign:andMatchDuration:")
    public native String getShortUrlWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String alias, String channel, String feature, String stage, NSObject campaign, @MachineSizedUInt long duration);
    @Method(selector = "getLongURLWithParams:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params);
    @Method(selector = "getLongURLWithParams:andFeature:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params, String feature);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params, String feature, String stage);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:andTags:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags);
    @Method(selector = "getLongURLWithParams:andFeature:andStage:andAlias:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params, String feature, String stage, String alias);
    @Method(selector = "getLongURLWithParams:andChannel:andTags:andFeature:andStage:andAlias:")
    public native String getLongURLWithParams(NSDictionary<?, ?> params, String channel, NSArray<?> tags, String feature, String stage, String alias);
    @Method(selector = "getShortURLWithCallback:")
    public native void getShortURLWithCallback(@Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andAlias:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, String alias, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andType:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, BranchLinkType type, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andChannel:andFeature:andStage:andMatchDuration:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, String channel, String feature, String stage, @MachineSizedUInt long duration, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andAlias:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, String alias, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andType:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, BranchLinkType type, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortURLWithParams:andTags:andChannel:andFeature:andStage:andMatchDuration:andCallback:")
    public native void getShortURLWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String channel, String feature, String stage, @MachineSizedUInt long duration, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andMatchDuration:andChannel:andFeature:andStage:andCallback:")
    public native void getShortUrlWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String alias, @MachineSizedUInt long duration, String channel, String feature, String stage, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getShortUrlWithParams:andTags:andAlias:andMatchDuration:andChannel:andFeature:andStage:andCampaign:andCallback:")
    public native void getShortUrlWithParams(NSDictionary<?, ?> params, NSArray<?> tags, String alias, @MachineSizedUInt long duration, String channel, String feature, String stage, String campaign, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getSpotlightUrlWithParams:callback:")
    public native void getSpotlightUrlWithParams(NSDictionary<?, ?> params, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:")
    public native void createDiscoverableContentWithTitle(String title, String description);
    @Method(selector = "createDiscoverableContentWithTitle:description:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:publiclyIndexable:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:type:publiclyIndexable:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, String type, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:keywords:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, NSSet<?> keywords, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:publiclyIndexable:keywords:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:type:publiclyIndexable:keywords:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, String type, boolean publiclyIndexable, NSSet<?> keywords);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:publiclyIndexable:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, boolean publiclyIndexable);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:expirationDate:callback:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "createDiscoverableContentWithTitle:description:thumbnailUrl:linkParams:type:publiclyIndexable:keywords:expirationDate:spotlightCallback:")
    public native void createDiscoverableContentWithTitle(String title, String description, NSURL thumbnailUrl, NSDictionary<?, ?> linkParams, String type, boolean publiclyIndexable, NSSet<?> keywords, NSDate expirationDate, @Block VoidBlock3<NSString, NSString, NSError> spotlightCallback);
    @Method(selector = "registerViewWithParams:andCallback:")
    public native void registerViewWithParams(NSDictionary<?, ?> params, @Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "getInstance")
    public static native Branch getInstance();
    @Method(selector = "getTestInstance")
    public static native Branch getTestInstance();
    @Method(selector = "getInstance:")
    public static native Branch getInstance(String branchKey);
    @Method(selector = "getBranchActivityItemWithParams:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params);
    @Method(selector = "getBranchActivityItemWithParams:feature:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature, String stage);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:alias:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags, String alias);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:campaign:tags:alias:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature, String stage, String campaign, NSArray<?> tags, String alias);
    @Method(selector = "getBranchActivityItemWithParams:feature:stage:tags:alias:delegate:")
    public static native BranchActivityItemProvider getBranchActivityItemWithParams(NSDictionary<?, ?> params, String feature, String stage, NSArray<?> tags, String alias, BranchActivityItemProviderDelegate delegate);
    /*</methods>*/
}
