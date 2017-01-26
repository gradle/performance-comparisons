package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_237 {
    private final Production93_237 production = new Production93_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}