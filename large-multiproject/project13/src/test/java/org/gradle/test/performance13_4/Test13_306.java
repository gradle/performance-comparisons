package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_306 {
    private final Production13_306 production = new Production13_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}