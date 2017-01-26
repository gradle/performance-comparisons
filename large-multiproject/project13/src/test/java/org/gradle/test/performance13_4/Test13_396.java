package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_396 {
    private final Production13_396 production = new Production13_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}