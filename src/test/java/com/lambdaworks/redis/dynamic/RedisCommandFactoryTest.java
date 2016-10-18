package com.lambdaworks.redis.dynamic;

import com.lambdaworks.redis.RedisFuture;
import com.lambdaworks.redis.dynamic.domain.Timeout;

import static org.junit.Assert.*;

/**
 * @author Mark Paluch
 */
public class RedisCommandFactoryTest {

    static interface AsyncWithTimeout {

        RedisFuture<String> get(String key, Timeout timeout);
    }

    static interface SyncWithTimeout {

        RedisFuture<String> get(String key);
    }

}