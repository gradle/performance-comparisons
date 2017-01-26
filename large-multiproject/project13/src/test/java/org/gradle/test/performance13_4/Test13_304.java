package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_304 {
    private final Production13_304 production = new Production13_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}