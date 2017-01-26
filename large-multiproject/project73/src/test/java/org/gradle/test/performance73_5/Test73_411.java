package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_411 {
    private final Production73_411 production = new Production73_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}