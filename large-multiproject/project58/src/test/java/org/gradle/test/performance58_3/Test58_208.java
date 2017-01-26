package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_208 {
    private final Production58_208 production = new Production58_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}