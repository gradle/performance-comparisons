package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_473 {
    private final Production58_473 production = new Production58_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}