package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_322 {
    private final Production58_322 production = new Production58_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}