package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_247 {
    private final Production58_247 production = new Production58_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}