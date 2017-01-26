package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_328 {
    private final Production58_328 production = new Production58_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}