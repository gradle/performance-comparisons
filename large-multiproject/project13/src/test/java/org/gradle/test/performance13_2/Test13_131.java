package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_131 {
    private final Production13_131 production = new Production13_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}