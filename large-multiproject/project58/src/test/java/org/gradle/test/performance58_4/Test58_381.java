package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_381 {
    private final Production58_381 production = new Production58_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}