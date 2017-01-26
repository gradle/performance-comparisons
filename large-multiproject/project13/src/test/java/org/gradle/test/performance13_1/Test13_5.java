package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_5 {
    private final Production13_5 production = new Production13_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}