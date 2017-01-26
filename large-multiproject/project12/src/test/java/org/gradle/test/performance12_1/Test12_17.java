package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_17 {
    private final Production12_17 production = new Production12_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}