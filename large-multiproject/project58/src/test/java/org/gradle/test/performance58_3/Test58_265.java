package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_265 {
    private final Production58_265 production = new Production58_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}