package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_494 {
    private final Production73_494 production = new Production73_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}