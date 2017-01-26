package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_118 {
    private final Production58_118 production = new Production58_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}