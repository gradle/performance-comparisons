package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_285 {
    private final Production58_285 production = new Production58_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}