package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_244 {
    private final Production13_244 production = new Production13_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}