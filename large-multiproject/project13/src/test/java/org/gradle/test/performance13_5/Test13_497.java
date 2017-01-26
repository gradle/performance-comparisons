package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_497 {
    private final Production13_497 production = new Production13_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}