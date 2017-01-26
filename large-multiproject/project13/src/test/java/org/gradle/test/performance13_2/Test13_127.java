package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_127 {
    private final Production13_127 production = new Production13_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}