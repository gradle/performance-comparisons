package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_36 {
    private final Production13_36 production = new Production13_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}