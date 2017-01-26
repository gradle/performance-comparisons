package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_8 {
    private final Production13_8 production = new Production13_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}