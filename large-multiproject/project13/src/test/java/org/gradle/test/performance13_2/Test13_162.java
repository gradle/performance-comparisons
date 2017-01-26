package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_162 {
    private final Production13_162 production = new Production13_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}