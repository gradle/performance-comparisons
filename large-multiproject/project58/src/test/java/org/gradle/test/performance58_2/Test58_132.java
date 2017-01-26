package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_132 {
    private final Production58_132 production = new Production58_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}