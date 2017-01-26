package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_399 {
    private final Production58_399 production = new Production58_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}