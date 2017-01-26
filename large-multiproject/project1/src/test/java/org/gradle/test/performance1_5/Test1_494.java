package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_494 {
    private final Production1_494 production = new Production1_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}