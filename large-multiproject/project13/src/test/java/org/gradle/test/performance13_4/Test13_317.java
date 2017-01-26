package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_317 {
    private final Production13_317 production = new Production13_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}