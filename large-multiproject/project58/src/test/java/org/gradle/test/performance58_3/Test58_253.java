package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_253 {
    private final Production58_253 production = new Production58_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}