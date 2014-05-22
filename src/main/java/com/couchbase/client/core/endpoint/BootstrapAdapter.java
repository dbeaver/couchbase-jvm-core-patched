/**
 * Copyright (C) 2014 Couchbase, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALING
 * IN THE SOFTWARE.
 */

package com.couchbase.client.core.endpoint;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;

/**
 * A wrapper for the IO {@link Bootstrap} class.
 *
 * This adapter is needed in order to properly mock the underlying {@link Bootstrap} class, since it is a final class
 * and can't be tested properly otherwise.
 */
public class BootstrapAdapter {

    /**
     * The underlying {@link Bootstrap}.
     */
    private final Bootstrap bootstrap;

    /**
     * Create a new {@link BootstrapAdapter}.
     *
     * @param bootstrap the wrapped bootstrap.
     */
    public BootstrapAdapter(final Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    /**
     * Connect the underlying {@link Bootstrap} and return a {@link ChannelFuture}.
     *
     * @return the future containing the channel and connect status.
     */
    public ChannelFuture connect() {
        return bootstrap.connect();
    }

}