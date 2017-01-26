package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_206 {
    private final Production13_206 production = new Production13_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}