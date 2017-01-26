package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_1 {
    private final Production13_1 production = new Production13_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}