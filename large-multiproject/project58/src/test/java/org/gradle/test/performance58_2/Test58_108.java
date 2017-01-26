package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_108 {
    private final Production58_108 production = new Production58_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}