package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_23 {
    private final Production37_23 production = new Production37_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}