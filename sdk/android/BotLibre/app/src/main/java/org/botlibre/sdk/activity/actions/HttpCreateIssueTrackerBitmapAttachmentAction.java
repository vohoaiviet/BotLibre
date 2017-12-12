/******************************************************************************
 *
 *  Copyright 2014 Paphus Solutions Inc.
 *
 *  Licensed under the Eclipse Public License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/

package org.botlibre.sdk.activity.actions;

import android.app.Activity;
import android.graphics.Bitmap;

import org.botlibre.sdk.activity.MainActivity;
import org.botlibre.sdk.config.MediaConfig;

public class HttpCreateIssueTrackerBitmapAttachmentAction extends HttpCreateIssueTrackerFileAttachmentAction {
	Bitmap bitmap;

	public HttpCreateIssueTrackerBitmapAttachmentAction(Activity activity, Bitmap bitmap, MediaConfig config) {
		super(activity, "", config);
		this.bitmap = bitmap;
	}

	@Override
	protected String doInBackground(Void... params) {
		try {
		this.config = MainActivity.connection.createIssueTrackerImageAttachment(this.bitmap, this.config);
		} catch (Exception exception) {
			this.exception = exception;
		}
		return "";
	}
}