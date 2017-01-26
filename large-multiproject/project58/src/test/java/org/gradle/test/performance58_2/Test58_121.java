package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_121 {
    private final Production58_121 production = new Production58_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}