package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_306 {
    private final Production35_306 production = new Production35_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}