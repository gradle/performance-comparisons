package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_52 {
    private final Production13_52 production = new Production13_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}