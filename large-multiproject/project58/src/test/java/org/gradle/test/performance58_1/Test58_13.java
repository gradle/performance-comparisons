package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_13 {
    private final Production58_13 production = new Production58_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}