package com.lambdaworks.redis.commands.rx;

import com.lambdaworks.redis.api.sync.RedisCommands;
import com.lambdaworks.redis.commands.BitCommandTest;

/**
 * @author Mark Paluch
 */
public class BitRxCommandTest extends BitCommandTest {

    @Override
    protected RedisCommands<String, String> connect() {
        bitstring = RxSyncInvocationHandler.sync(client.connectAsync(new BitStringCodec()).getStatefulConnection());
        return RxSyncInvocationHandler.sync(client.connectAsync().getStatefulConnection());
    }
}
