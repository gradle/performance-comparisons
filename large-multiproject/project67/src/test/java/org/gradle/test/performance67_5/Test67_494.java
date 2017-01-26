package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_494 {
    private final Production67_494 production = new Production67_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}