package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_233 {
    private final Production58_233 production = new Production58_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}