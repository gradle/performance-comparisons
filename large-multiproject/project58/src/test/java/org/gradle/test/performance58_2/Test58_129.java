package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_129 {
    private final Production58_129 production = new Production58_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}