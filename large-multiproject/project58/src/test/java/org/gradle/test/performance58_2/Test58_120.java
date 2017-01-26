package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_120 {
    private final Production58_120 production = new Production58_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}