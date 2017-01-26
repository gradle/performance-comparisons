package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_114 {
    private final Production13_114 production = new Production13_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}