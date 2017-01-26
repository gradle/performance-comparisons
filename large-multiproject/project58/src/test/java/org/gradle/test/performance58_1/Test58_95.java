package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_95 {
    private final Production58_95 production = new Production58_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}