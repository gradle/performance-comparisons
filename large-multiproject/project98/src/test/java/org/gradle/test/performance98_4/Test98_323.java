package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_323 {
    private final Production98_323 production = new Production98_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}