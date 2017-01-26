package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_249 {
    private final Production13_249 production = new Production13_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}