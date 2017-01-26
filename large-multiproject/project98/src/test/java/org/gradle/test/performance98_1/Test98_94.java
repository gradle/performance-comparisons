package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_94 {
    private final Production98_94 production = new Production98_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}