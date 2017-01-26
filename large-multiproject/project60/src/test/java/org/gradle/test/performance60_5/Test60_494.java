package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_494 {
    private final Production60_494 production = new Production60_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}