package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_17 {
    private final Production7_17 production = new Production7_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}