package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_307 {
    private final Production58_307 production = new Production58_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}