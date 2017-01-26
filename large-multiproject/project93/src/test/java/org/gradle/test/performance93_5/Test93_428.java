package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_428 {
    private final Production93_428 production = new Production93_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}