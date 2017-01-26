package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_271 {
    private final Production58_271 production = new Production58_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}