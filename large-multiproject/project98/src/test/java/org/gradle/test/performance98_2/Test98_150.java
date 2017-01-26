package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_150 {
    private final Production98_150 production = new Production98_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}