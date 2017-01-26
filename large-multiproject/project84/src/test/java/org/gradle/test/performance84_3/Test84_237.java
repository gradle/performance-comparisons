package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_237 {
    private final Production84_237 production = new Production84_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}