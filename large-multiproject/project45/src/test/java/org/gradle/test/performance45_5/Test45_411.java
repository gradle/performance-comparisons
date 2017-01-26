package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_411 {
    private final Production45_411 production = new Production45_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}