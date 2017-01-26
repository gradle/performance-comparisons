package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_83 {
    private final Production13_83 production = new Production13_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}