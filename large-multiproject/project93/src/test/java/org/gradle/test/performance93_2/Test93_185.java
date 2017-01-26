package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_185 {
    private final Production93_185 production = new Production93_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}