package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_421 {
    private final Production98_421 production = new Production98_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}