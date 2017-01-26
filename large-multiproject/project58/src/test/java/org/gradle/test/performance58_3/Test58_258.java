package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_258 {
    private final Production58_258 production = new Production58_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}