package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_216 {
    private final Production58_216 production = new Production58_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}