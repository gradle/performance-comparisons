package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_413 {
    private final Production58_413 production = new Production58_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}