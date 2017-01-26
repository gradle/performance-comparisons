package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_156 {
    private final Production13_156 production = new Production13_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}