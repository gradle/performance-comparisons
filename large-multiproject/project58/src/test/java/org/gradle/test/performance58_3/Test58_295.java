package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_295 {
    private final Production58_295 production = new Production58_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}