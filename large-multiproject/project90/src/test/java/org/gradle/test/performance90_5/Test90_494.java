package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_494 {
    private final Production90_494 production = new Production90_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}