package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_86 {
    private final Production98_86 production = new Production98_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}