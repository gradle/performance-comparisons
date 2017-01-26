package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_412 {
    private final Production58_412 production = new Production58_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}