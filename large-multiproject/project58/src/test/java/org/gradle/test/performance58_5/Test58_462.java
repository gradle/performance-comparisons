package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_462 {
    private final Production58_462 production = new Production58_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}