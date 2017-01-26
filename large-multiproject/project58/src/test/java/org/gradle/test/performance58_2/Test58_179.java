package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_179 {
    private final Production58_179 production = new Production58_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}