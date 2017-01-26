package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_279 {
    private final Production58_279 production = new Production58_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}