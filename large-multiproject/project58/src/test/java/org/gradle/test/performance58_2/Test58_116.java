package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_116 {
    private final Production58_116 production = new Production58_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}