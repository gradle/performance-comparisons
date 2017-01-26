package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_245 {
    private final Production20_245 production = new Production20_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}