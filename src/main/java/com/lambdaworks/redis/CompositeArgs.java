package com.lambdaworks.redis;

import com.lambdaworks.redis.protocol.CommandArgs;

/**
 * @author Mark Paluch
 */
abstract class CompositeArgs {

    abstract <K, V> void build(CommandArgs<K, V> args);
}
