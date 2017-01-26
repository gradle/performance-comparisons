package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_411 {
    private final Production10_411 production = new Production10_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}