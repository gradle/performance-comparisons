package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_17 {
    private final Production43_17 production = new Production43_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}