package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_258 {
    private final Production13_258 production = new Production13_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}