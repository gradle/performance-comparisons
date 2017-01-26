package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_494 {
    private final Production44_494 production = new Production44_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}