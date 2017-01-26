package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_33 {
    private final Production98_33 production = new Production98_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}