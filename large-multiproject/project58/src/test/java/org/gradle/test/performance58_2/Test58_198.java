package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_198 {
    private final Production58_198 production = new Production58_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}