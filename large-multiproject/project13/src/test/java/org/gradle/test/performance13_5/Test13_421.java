package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_421 {
    private final Production13_421 production = new Production13_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}