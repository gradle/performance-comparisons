package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_487 {
    private final Production93_487 production = new Production93_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}