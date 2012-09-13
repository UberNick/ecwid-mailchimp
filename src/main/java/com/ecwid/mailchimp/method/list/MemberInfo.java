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
package com.ecwid.mailchimp.method.list;

import com.ecwid.mailchimp.MailChimpMap;
import com.ecwid.mailchimp.MailChimpObject;
import java.util.Date;

/**
 *
 * @author Vasily Karyaev <v.karyaev@gmail.com>
 */
public class MemberInfo extends MailChimpObject {
	@Field
	public String id;
	
	@Field
	public String email;
	
	@Field
	public EmailType email_type;
	
	@Field
	public MailChimpMap merges;
	
	@Field
	public MemberStatus status;
	
	@Field
	public Date timestamp;
	
	/**
	 * This field indicates email, associated with {@link #error}.
	 */
	@Field
	public String email_address;

	/**
	 * Error message.
	 */
	@Field
	public String error;
}
