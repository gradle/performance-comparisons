package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_249 {
    private final Production58_249 production = new Production58_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}