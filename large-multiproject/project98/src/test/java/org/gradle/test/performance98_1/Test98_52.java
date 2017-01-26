package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_52 {
    private final Production98_52 production = new Production98_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}