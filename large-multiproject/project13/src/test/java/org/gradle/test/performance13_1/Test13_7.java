package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_7 {
    private final Production13_7 production = new Production13_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}