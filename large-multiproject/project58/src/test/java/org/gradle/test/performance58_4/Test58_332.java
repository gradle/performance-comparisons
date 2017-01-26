package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_332 {
    private final Production58_332 production = new Production58_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}