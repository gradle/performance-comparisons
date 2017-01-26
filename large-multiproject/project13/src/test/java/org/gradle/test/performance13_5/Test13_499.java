package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_499 {
    private final Production13_499 production = new Production13_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}