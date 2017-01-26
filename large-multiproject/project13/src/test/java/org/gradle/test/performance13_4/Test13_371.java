package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_371 {
    private final Production13_371 production = new Production13_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}