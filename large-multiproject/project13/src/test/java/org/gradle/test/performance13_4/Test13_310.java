package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_310 {
    private final Production13_310 production = new Production13_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}