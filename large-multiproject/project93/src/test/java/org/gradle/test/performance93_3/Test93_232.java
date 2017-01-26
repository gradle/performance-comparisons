package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_232 {
    private final Production93_232 production = new Production93_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}