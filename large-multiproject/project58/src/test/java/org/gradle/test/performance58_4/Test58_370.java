package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_370 {
    private final Production58_370 production = new Production58_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}