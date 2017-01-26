package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_54 {
    private final Production13_54 production = new Production13_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}