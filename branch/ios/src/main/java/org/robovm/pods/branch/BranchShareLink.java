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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchShareLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchShareLinkPtr extends Ptr<BranchShareLink, BranchShareLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchShareLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchShareLink() {}
    protected BranchShareLink(Handle h, long handle) { super(h, handle); }
    protected BranchShareLink(SkipInit skipInit) { super(skipInit); }
    public BranchShareLink(BranchUniversalObject universalObject, BranchLinkProperties linkProperties) { super((SkipInit) null); initObject(initWithUniversalObject(universalObject, linkProperties)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "shareText")
    public native String getShareText();
    @Property(selector = "setShareText:")
    public native void setShareText(String v);
    @Property(selector = "shareObject")
    public native NSObject getShareObject();
    @Property(selector = "setShareObject:")
    public native void setShareObject(NSObject v);
    @Property(selector = "shareURL")
    public native NSURL getShareURL();
    @Property(selector = "activityType")
    public native String getActivityType();
    @Property(selector = "serverParameters")
    public native NSMutableDictionary<?, ?> getServerParameters();
    @Property(selector = "setServerParameters:")
    public native void setServerParameters(NSMutableDictionary<?, ?> v);
    @Property(selector = "universalObject")
    public native BranchUniversalObject getUniversalObject();
    @Property(selector = "linkProperties")
    public native BranchLinkProperties getLinkProperties();
    @Property(selector = "delegate")
    public native BranchShareLinkDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BranchShareLinkDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUniversalObject:linkProperties:")
    protected native @Pointer long initWithUniversalObject(BranchUniversalObject universalObject, BranchLinkProperties linkProperties);
    @Method(selector = "activityItems")
    public native NSArray<UIActivityItemProvider> activityItems();
    @Method(selector = "presentActivityViewControllerFromViewController:anchor:")
    public native void presentActivityViewControllerFromViewController(UIViewController viewController, UIBarButtonItem anchor);
    /*</methods>*/
}
