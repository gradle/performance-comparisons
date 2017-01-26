package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_440 {
    private final Production13_440 production = new Production13_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}