package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_423 {
    private final Production58_423 production = new Production58_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}