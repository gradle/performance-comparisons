package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_421 {
    private final Production58_421 production = new Production58_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}