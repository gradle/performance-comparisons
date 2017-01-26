package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_17 {
    private final Production74_17 production = new Production74_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}