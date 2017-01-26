package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_16 {
    private final Production98_16 production = new Production98_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}