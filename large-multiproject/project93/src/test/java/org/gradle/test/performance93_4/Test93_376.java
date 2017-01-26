package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_376 {
    private final Production93_376 production = new Production93_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}