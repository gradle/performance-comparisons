package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_396 {
    private final Production58_396 production = new Production58_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}