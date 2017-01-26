package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_411 {
    private final Production8_411 production = new Production8_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}