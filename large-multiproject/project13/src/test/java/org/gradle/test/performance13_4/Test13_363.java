package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_363 {
    private final Production13_363 production = new Production13_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}