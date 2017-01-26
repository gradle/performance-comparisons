package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_106 {
    private final Production13_106 production = new Production13_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}