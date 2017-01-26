package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_494 {
    private final Production49_494 production = new Production49_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}