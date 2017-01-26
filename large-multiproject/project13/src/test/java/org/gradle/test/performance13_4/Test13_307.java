package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_307 {
    private final Production13_307 production = new Production13_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}