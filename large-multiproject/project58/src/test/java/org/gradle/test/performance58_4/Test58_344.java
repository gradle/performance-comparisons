package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_344 {
    private final Production58_344 production = new Production58_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}