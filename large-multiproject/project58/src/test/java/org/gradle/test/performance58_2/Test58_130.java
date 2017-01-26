package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_130 {
    private final Production58_130 production = new Production58_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}