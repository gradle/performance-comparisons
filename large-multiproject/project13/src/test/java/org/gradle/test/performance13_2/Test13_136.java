package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_136 {
    private final Production13_136 production = new Production13_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}