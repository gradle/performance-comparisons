package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_482 {
    private final Production13_482 production = new Production13_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}