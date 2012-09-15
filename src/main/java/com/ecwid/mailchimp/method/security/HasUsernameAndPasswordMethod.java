/*
 * Copyright 2012 Ecwid, Inc.
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
package com.ecwid.mailchimp.method.security;

import com.ecwid.mailchimp.MailChimpMethod;

/**
 * Base class for all MailChimp methods which have the username and password fields.
 *
 * @author Vasily Karyaev <v.karyaev@gmail.com>
 */
public abstract class HasUsernameAndPasswordMethod<R> extends MailChimpMethod<R> {
	@Field
	public String username, password;
}
