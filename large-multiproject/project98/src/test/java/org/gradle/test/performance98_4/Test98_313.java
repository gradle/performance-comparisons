package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_313 {
    private final Production98_313 production = new Production98_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}