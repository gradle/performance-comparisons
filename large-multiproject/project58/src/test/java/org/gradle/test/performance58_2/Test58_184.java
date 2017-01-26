package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_184 {
    private final Production58_184 production = new Production58_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}