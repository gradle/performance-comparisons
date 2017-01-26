package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_160 {
    private final Production58_160 production = new Production58_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}