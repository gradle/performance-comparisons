package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_57 {
    private final Production58_57 production = new Production58_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}