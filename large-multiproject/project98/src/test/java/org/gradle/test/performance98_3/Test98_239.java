package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_239 {
    private final Production98_239 production = new Production98_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}