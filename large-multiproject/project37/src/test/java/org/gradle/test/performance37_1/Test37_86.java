package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_86 {
    private final Production37_86 production = new Production37_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}