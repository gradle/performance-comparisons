package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_254 {
    private final Production13_254 production = new Production13_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}