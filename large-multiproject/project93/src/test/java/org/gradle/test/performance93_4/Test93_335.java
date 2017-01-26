package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_335 {
    private final Production93_335 production = new Production93_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}