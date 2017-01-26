package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_341 {
    private final Production58_341 production = new Production58_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}