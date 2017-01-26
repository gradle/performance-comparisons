package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_308 {
    private final Production58_308 production = new Production58_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}