package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_290 {
    private final Production98_290 production = new Production98_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}