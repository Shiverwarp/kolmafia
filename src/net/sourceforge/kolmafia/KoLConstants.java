/**
 * Copyright (c) 2005, KoLmafia development team
 * http://kolmafia.sourceforge.net/
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  [1] Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *  [2] Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in
 *      the documentation and/or other materials provided with the
 *      distribution.
 *  [3] Neither the name "KoLmafia development team" nor the names of
 *      its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written
 *      permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package net.sourceforge.kolmafia;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.DecimalFormatSymbols;

import net.java.dev.spellcast.utilities.UtilityConstants;

public interface KoLConstants extends UtilityConstants
{
	public static final String VERSION_NAME = "KoLmafia v5.6";
	public static final String VERSION_DATE = "Released September 29, 2005";
	public static final KoLSettings GLOBAL_SETTINGS = new KoLSettings();

	public static final List existingFrames = new ArrayList();

	public static final DecimalFormat df = new DecimalFormat(
		"#,##0", new DecimalFormatSymbols( Locale.US ) );

	public static final SimpleDateFormat sdf = new SimpleDateFormat( "yyyyMMdd" );

	public static final int NOCHANGE        = 0;
	public static final int ERROR_STATE     = 1;
	public static final int ENABLED_STATE   = 2;
	public static final int DISABLED_STATE  = 3;
	public static final int CANCELLED_STATE = 4;

	public static class DaemonThread extends Thread
	{
		public DaemonThread()
		{	this( null );
		}

		public DaemonThread( Runnable target )
		{
			super( target );
			setDaemon( true );
		}
	}
}