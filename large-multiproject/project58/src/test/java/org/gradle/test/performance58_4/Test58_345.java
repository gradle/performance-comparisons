package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_345 {
    private final Production58_345 production = new Production58_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}