package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_313 {
    private final Production13_313 production = new Production13_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}