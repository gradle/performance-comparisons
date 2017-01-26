package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_401 {
    private final Production13_401 production = new Production13_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}