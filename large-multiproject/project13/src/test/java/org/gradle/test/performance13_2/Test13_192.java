package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_192 {
    private final Production13_192 production = new Production13_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}