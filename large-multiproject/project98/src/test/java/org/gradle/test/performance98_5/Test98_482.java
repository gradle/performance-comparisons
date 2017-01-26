package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_482 {
    private final Production98_482 production = new Production98_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}