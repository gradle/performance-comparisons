package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_479 {
    private final Production35_479 production = new Production35_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}