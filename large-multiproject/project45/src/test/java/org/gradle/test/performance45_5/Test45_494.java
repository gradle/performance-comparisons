package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_494 {
    private final Production45_494 production = new Production45_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}