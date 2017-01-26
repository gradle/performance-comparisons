package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_494 {
    private final Production79_494 production = new Production79_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}