package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_333 {
    private final Production58_333 production = new Production58_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}