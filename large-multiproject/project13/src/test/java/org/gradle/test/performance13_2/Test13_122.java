package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_122 {
    private final Production13_122 production = new Production13_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}