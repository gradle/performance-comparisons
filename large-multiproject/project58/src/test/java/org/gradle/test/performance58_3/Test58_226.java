package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_226 {
    private final Production58_226 production = new Production58_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}