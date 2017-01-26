package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_411 {
    private final Production12_411 production = new Production12_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}