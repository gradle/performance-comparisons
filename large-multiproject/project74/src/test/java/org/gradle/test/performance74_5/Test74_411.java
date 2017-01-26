package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_411 {
    private final Production74_411 production = new Production74_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}