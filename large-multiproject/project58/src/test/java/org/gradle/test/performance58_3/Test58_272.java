package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_272 {
    private final Production58_272 production = new Production58_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}