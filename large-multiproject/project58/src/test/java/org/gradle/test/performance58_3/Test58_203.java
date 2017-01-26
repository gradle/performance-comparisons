package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_203 {
    private final Production58_203 production = new Production58_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}