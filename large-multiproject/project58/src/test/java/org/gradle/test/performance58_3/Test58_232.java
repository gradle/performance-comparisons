package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_232 {
    private final Production58_232 production = new Production58_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}