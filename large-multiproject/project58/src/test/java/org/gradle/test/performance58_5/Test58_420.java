package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_420 {
    private final Production58_420 production = new Production58_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}