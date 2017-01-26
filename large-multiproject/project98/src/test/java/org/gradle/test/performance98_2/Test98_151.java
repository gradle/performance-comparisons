package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_151 {
    private final Production98_151 production = new Production98_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}