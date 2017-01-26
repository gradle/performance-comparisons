package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_494 {
    private final Production99_494 production = new Production99_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}