package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_132 {
    private final Production93_132 production = new Production93_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}