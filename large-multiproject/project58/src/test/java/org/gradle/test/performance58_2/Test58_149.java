package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_149 {
    private final Production58_149 production = new Production58_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}