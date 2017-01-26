package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_304 {
    private final Production58_304 production = new Production58_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}