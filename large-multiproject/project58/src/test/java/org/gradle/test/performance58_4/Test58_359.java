package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_359 {
    private final Production58_359 production = new Production58_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}