package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_264 {
    private final Production13_264 production = new Production13_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}