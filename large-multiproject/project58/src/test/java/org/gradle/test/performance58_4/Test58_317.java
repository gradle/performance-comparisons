package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_317 {
    private final Production58_317 production = new Production58_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}