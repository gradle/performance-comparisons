package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_170 {
    private final Production58_170 production = new Production58_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}