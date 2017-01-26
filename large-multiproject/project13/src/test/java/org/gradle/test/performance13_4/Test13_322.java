package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_322 {
    private final Production13_322 production = new Production13_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}