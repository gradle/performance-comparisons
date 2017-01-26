package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_158 {
    private final Production13_158 production = new Production13_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}