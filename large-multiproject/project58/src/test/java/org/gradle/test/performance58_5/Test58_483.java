package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_483 {
    private final Production58_483 production = new Production58_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}