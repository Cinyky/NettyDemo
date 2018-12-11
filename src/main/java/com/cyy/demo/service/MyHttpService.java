package com.cyy.demo.service;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

public interface MyHttpService {
    void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest request);
}
