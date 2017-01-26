package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_274 {
    private final Production58_274 production = new Production58_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}