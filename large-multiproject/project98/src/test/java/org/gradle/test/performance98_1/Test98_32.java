package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_32 {
    private final Production98_32 production = new Production98_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}