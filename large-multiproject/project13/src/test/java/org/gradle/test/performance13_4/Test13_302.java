package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_302 {
    private final Production13_302 production = new Production13_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}