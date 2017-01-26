package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_206 {
    private final Production98_206 production = new Production98_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}