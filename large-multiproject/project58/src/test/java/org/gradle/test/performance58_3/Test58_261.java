package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_261 {
    private final Production58_261 production = new Production58_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}