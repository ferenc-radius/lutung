/**
 * 
 */
package com.microtripit.mandrillapp.lutung;

import com.microtripit.mandrillapp.lutung.controller.MandrillExportsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillInboundApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillIpsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillMessagesApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillRejectsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillSendersApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillSubaccountsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillTagsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillTemplatesApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillUrlsApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillUsersApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillWebhooksApi;
import com.microtripit.mandrillapp.lutung.controller.MandrillWhitelistsApi;

/**
 * @author rschreijer
 * @since Mar 17, 2013
 */
public class MandrillApi {
	private String key;
	private final MandrillUsersApi users;
	private final MandrillMessagesApi messages;
	private final MandrillTagsApi tags;
	private final MandrillRejectsApi rejects;
	private final MandrillWhitelistsApi whitelists;
	private final MandrillSendersApi senders;
	private final MandrillUrlsApi urls;
	private final MandrillTemplatesApi templates;
	private final MandrillWebhooksApi webhooks;
	private final MandrillSubaccountsApi subaccounts;
	private final MandrillInboundApi inbound;
	private final MandrillExportsApi exports;
	private final MandrillIpsApi ips;
	
	public MandrillApi(final String key) {
		if(key == null) {
			throw new NullPointerException(
					"'key' is null; please provide Mandrill API key");
			
		}
		this.key = key;
		users = new MandrillUsersApi(key);
		messages = new MandrillMessagesApi(key);
		tags = new MandrillTagsApi(key);
		rejects = new MandrillRejectsApi(key);
		whitelists = new MandrillWhitelistsApi(key);
		senders = new MandrillSendersApi(key);
		urls = new MandrillUrlsApi(key);
		templates = new MandrillTemplatesApi(key);
		webhooks = new MandrillWebhooksApi(key);
		subaccounts = new MandrillSubaccountsApi(key);
		inbound = new MandrillInboundApi(key);
		exports = new MandrillExportsApi(key);
		ips = new MandrillIpsApi(key);
	}

	/**
	 * @return Your Mandrill API key.
	 */
	public final String getKey() {
		return key;
	}
	
	/**
	 * <p>Get access to 'users' calls.</p>
	 * @return An object with access to user calls.
	 */
	public final MandrillUsersApi users() {
		return users;
	}
	
	public final MandrillMessagesApi messages() {
		return messages;
	}
	
	public final MandrillTagsApi tags() {
		return tags;
	}
	
	public final MandrillRejectsApi rejects() {
		return rejects;
	}
	
	public final MandrillWhitelistsApi whitelists() {
		return whitelists;
	}
	
	public final MandrillSendersApi senders() {
		return senders;
	}
	
	public final MandrillUrlsApi urls() {
		return urls;
	}
	
	public final MandrillTemplatesApi templates() {
		return templates;
	}
	
	public final MandrillWebhooksApi webhooks() {
		return webhooks;
	}
	
	public final MandrillSubaccountsApi subaccounts() {
		return subaccounts;
	}
	
	public final MandrillInboundApi inbound() {
		return inbound;
	}
	
	public final MandrillExportsApi exports() {
		return exports;
	}
	
	public final MandrillIpsApi ips() {
		return ips;
	}
	
}
