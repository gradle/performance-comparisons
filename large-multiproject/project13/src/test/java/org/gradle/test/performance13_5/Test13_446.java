package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_446 {
    private final Production13_446 production = new Production13_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}