package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_152 {
    private final Production13_152 production = new Production13_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}