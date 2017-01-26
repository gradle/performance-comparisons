package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_389 {
    private final Production58_389 production = new Production58_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}