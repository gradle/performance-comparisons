package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_79 {
    private final Production98_79 production = new Production98_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}