package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_441 {
    private final Production58_441 production = new Production58_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}