package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_283 {
    private final Production58_283 production = new Production58_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}