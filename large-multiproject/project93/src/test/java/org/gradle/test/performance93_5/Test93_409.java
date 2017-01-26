package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_409 {
    private final Production93_409 production = new Production93_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}