package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_47 {
    private final Production13_47 production = new Production13_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}