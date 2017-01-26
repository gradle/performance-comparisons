package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_223 {
    private final Production58_223 production = new Production58_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}