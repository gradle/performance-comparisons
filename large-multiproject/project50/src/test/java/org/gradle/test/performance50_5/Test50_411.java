package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_411 {
    private final Production50_411 production = new Production50_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}