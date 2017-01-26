package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_257 {
    private final Production58_257 production = new Production58_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}