package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_235 {
    private final Production98_235 production = new Production98_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}