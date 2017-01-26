package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_237 {
    private final Production4_237 production = new Production4_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}