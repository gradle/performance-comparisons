package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_494 {
    private final Production97_494 production = new Production97_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}