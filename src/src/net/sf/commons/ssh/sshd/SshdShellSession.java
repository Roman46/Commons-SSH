/*
 * Copyright 2009-2009 CommonsSSH Project.
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
package net.sf.commons.ssh.sshd;

import java.io.InputStream;
import java.io.OutputStream;

import net.sf.commons.ssh.ShellSession;

import org.apache.sshd.client.channel.ChannelSession;

/**
 * @since 1.3
 * @author Sergey Vladimirov (vlsergey at gmail dot com)
 */
class SshdShellSession extends SshdAbstractSession implements ShellSession {
    SshdShellSession(final ChannelSession channelSession) throws Exception {
	super(channelSession, null);

	log.trace("<init>");
    }

    public InputStream getInputStream() {
	return super.getInputStream();
    }

    public OutputStream getOutputStream() {
	return super.getOutputStream();
    }

}