package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_363 {
    private final Production98_363 production = new Production98_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}