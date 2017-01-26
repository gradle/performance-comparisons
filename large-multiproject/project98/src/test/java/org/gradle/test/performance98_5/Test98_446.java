package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_446 {
    private final Production98_446 production = new Production98_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}