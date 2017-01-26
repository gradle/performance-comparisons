package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_441 {
    private final Production13_441 production = new Production13_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}