package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_221 {
    private final Production13_221 production = new Production13_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}