package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_342 {
    private final Production58_342 production = new Production58_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}