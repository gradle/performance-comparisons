package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_291 {
    private final Production98_291 production = new Production98_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}