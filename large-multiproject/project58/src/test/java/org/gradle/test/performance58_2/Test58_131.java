package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_131 {
    private final Production58_131 production = new Production58_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}