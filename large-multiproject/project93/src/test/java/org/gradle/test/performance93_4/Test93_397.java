package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_397 {
    private final Production93_397 production = new Production93_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}