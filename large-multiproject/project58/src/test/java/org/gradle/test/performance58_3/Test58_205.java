package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_205 {
    private final Production58_205 production = new Production58_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}