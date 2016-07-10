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
package org.robovm.pods.bolts;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFExecutor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFExecutorPtr extends Ptr<BFExecutor, BFExecutorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFExecutor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFExecutor() {}
    protected BFExecutor(SkipInit skipInit) { super(skipInit); }
    public BFExecutor(@Block("(@Block)") VoidBlock1<Runnable> block) { super(create(block)); retain(getHandle()); }
    public BFExecutor(DispatchQueue queue) { super(create(queue)); retain(getHandle()); }
    public BFExecutor(NSOperationQueue queue) { super(create(queue)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "execute:")
    public native void execute(@Block Runnable block);
    @Method(selector = "defaultExecutor")
    public static native BFExecutor getDefaultExecutor();
    @Method(selector = "immediateExecutor")
    public static native BFExecutor getImmediateExecutor();
    @Method(selector = "mainThreadExecutor")
    public static native BFExecutor getMainThreadExecutor();
    @Method(selector = "executorWithBlock:")
    protected static native @Pointer long create(@Block("(@Block)") VoidBlock1<Runnable> block);
    @Method(selector = "executorWithDispatchQueue:")
    protected static native @Pointer long create(DispatchQueue queue);
    @Method(selector = "executorWithOperationQueue:")
    protected static native @Pointer long create(NSOperationQueue queue);
    /*</methods>*/
}
