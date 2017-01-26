package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_379 {
    private final Production58_379 production = new Production58_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}