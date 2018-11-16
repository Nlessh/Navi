/*
 * Copyright 2018 Yang Lifan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iqiyi.navi.spring;

import com.iqiyi.navi.core.matcher.EqualMatcher;
import com.iqiyi.navi.core.matcher.VersionMatcher;
import org.springframework.stereotype.Component;

/**
 * @author Yang Lifan
 */


@EqualMatcher(property = "platform", value = "android")
@VersionMatcher(property = "clientVersion", range = "[9.1.0,*]")
@Component
public class AndroidV910CouponHandler implements CouponHandler {
	@Override
	public void handleCoupon(CouponRequest couponRequest) {

	}
}