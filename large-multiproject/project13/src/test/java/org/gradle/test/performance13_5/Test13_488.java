package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_488 {
    private final Production13_488 production = new Production13_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}