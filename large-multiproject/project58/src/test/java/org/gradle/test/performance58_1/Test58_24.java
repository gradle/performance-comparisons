package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_24 {
    private final Production58_24 production = new Production58_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}