package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_287 {
    private final Production58_287 production = new Production58_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}