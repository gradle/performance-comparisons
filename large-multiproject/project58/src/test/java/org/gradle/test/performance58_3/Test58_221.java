package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_221 {
    private final Production58_221 production = new Production58_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}