package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_283 {
    private final Production98_283 production = new Production98_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}