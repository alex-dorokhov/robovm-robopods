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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VKApiObjectArray/*</name>*/ <T extends VKApiObject>
extends /*<extends>*/VKApiObject/*</extends>*/
    /*<implements>*/implements NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class VKApiObjectArrayPtr extends Ptr<VKApiObjectArray, VKApiObjectArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VKApiObjectArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VKApiObjectArray() {}
    protected VKApiObjectArray(Handle h, long handle) { super(h, handle); }
    protected VKApiObjectArray(SkipInit skipInit) { super(skipInit); }
    public VKApiObjectArray(NSDictionary<?, ?> dict, Class<?> objectClass) { super((SkipInit) null); initObject(initWithDictionary(dict, objectClass)); }
    public VKApiObjectArray(NSArray<?> array, Class<?> objectClass) { super((SkipInit) null); initObject(initWithArray(array, objectClass)); }
    public VKApiObjectArray(NSArray<?> array) { super((SkipInit) null); initObject(initWithArray(array)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    @Property(selector = "items")
    public native NSMutableArray<?> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSMutableArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:objectClass:")
    protected native @Pointer long initWithDictionary(NSDictionary<?, ?> dict, Class<?> objectClass);
    @Method(selector = "initWithArray:objectClass:")
    protected native @Pointer long initWithArray(NSArray<?> array, Class<?> objectClass);
    @Method(selector = "initWithArray:")
    protected native @Pointer long initWithArray(NSArray<?> array);
    @Method(selector = "objectAtIndex:")
    public native T objectAtIndex(@MachineSizedSInt long idx);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "objectAtIndexedSubscript:")
    public native T objectAtIndexedSubscript(@MachineSizedUInt long idx);
    @Method(selector = "objectEnumerator")
    public native NSEnumerator<?> objectEnumerator();
    @Method(selector = "reverseObjectEnumerator")
    public native NSEnumerator<?> reverseObjectEnumerator();
    @Method(selector = "addObject:")
    public native void addObject(VKApiObject object);
    @Method(selector = "removeObject:")
    public native void removeObject(VKApiObject object);
    @Method(selector = "insertObject:atIndex:")
    public native void insertObject(VKApiObject object, @MachineSizedUInt long index);
    @Method(selector = "firstObject")
    public native T firstObject();
    @Method(selector = "lastObject")
    public native T lastObject();
    @Method(selector = "serializeTo:withName:")
    public native void serializeTo(NSMutableDictionary<?, ?> dict, String name);
    @Method(selector = "objectClass")
    public native Class<?> objectClass();
    /*</methods>*/
}
