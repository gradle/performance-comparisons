package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_411 {
    private final Production67_411 production = new Production67_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}