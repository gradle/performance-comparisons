package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_197 {
    private final Production93_197 production = new Production93_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}