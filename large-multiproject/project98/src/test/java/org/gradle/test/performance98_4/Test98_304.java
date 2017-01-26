package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_304 {
    private final Production98_304 production = new Production98_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}