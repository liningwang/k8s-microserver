package com.wang.config;

/**
 * @ClassName StandardModuloShardingTableAlgorithm
 * @Description
 * @Author liningwang
 * @Date 2020-11-18 16:46
 * @Version 1.0
 */
import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public final class StandardModuloShardingTableAlgorithm implements PreciseShardingAlgorithm<String> {

    private Properties props = new Properties();

    @Override
    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<String> shardingValue) {
        for (String each : tableNames) {
            if (each.endsWith(String.valueOf(Long.valueOf(shardingValue.getValue()) % 2))) {
                return each;
            }
        }
        throw new UnsupportedOperationException("");
    }
}
