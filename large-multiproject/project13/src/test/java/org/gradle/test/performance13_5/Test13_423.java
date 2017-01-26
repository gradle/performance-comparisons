package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_423 {
    private final Production13_423 production = new Production13_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}