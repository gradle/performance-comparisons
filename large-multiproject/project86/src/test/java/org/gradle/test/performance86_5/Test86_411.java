package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_411 {
    private final Production86_411 production = new Production86_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}