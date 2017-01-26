package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_317 {
    private final Production98_317 production = new Production98_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}