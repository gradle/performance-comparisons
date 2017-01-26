package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_462 {
    private final Production13_462 production = new Production13_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}