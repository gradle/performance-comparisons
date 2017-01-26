package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_411 {
    private final Production26_411 production = new Production26_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}