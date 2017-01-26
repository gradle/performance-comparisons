package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_280 {
    private final Production58_280 production = new Production58_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}