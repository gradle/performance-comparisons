package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_298 {
    private final Production58_298 production = new Production58_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}