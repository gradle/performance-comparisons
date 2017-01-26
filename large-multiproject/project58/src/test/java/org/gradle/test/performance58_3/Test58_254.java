package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_254 {
    private final Production58_254 production = new Production58_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}