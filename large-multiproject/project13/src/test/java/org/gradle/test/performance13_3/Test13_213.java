package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_213 {
    private final Production13_213 production = new Production13_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}