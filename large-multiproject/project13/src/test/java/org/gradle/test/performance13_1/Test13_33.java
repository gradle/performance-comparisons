package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_33 {
    private final Production13_33 production = new Production13_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}