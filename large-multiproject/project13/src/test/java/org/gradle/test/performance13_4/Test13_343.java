package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_343 {
    private final Production13_343 production = new Production13_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}