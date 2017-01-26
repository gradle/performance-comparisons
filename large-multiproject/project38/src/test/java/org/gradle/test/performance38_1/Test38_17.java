package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_17 {
    private final Production38_17 production = new Production38_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}