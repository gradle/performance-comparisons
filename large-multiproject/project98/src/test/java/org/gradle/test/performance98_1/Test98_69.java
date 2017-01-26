package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_69 {
    private final Production98_69 production = new Production98_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}