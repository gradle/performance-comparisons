package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_237 {
    private final Production58_237 production = new Production58_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}