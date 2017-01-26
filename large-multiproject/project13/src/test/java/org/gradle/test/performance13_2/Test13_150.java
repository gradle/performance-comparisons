package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_150 {
    private final Production13_150 production = new Production13_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}