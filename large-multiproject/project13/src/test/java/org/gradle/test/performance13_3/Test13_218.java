package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_218 {
    private final Production13_218 production = new Production13_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}