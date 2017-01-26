package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_236 {
    private final Production93_236 production = new Production93_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}