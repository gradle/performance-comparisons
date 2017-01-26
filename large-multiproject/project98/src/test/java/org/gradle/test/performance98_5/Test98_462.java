package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_462 {
    private final Production98_462 production = new Production98_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}