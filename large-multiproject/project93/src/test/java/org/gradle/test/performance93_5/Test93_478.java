package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_478 {
    private final Production93_478 production = new Production93_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}