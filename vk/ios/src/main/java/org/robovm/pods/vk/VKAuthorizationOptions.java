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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/VKAuthorizationOptions/*</name>*/ extends Bits</*<name>*/VKAuthorizationOptions/*</name>*/> {
    /*<values>*/
    public static final VKAuthorizationOptions None = new VKAuthorizationOptions(0L);
    public static final VKAuthorizationOptions UnlimitedToken = new VKAuthorizationOptions(1L);
    public static final VKAuthorizationOptions DisableSafariController = new VKAuthorizationOptions(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/VKAuthorizationOptions/*</name>*/[] values = _values(/*<name>*/VKAuthorizationOptions/*</name>*/.class);

    public /*<name>*/VKAuthorizationOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/VKAuthorizationOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/VKAuthorizationOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/VKAuthorizationOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/VKAuthorizationOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/VKAuthorizationOptions/*</name>*/[] values() {
        return values.clone();
    }
}
