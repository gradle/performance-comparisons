package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_494 {
    private final Production94_494 production = new Production94_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}