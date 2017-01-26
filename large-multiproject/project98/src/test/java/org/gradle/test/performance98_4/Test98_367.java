package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_367 {
    private final Production98_367 production = new Production98_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}