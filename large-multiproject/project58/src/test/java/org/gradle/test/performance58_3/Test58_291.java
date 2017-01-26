package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_291 {
    private final Production58_291 production = new Production58_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}