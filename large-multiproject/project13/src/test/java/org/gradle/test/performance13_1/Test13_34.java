package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_34 {
    private final Production13_34 production = new Production13_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}