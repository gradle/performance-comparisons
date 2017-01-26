package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_141 {
    private final Production58_141 production = new Production58_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}