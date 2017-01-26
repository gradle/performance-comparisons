package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_391 {
    private final Production93_391 production = new Production93_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}