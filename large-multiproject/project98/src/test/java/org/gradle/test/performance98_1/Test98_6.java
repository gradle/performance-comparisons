package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_6 {
    private final Production98_6 production = new Production98_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}