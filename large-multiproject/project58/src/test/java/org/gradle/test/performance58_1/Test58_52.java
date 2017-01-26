package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_52 {
    private final Production58_52 production = new Production58_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}