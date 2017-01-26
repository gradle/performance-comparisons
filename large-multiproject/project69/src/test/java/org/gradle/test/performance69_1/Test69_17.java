package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_17 {
    private final Production69_17 production = new Production69_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}