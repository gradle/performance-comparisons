package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_17 {
    private final Production30_17 production = new Production30_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}