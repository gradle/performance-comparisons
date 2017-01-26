package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_354 {
    private final Production13_354 production = new Production13_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}