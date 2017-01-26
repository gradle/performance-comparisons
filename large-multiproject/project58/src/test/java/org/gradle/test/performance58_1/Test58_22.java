package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_22 {
    private final Production58_22 production = new Production58_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}