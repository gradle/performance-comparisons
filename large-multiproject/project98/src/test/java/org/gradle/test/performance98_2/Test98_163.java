package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_163 {
    private final Production98_163 production = new Production98_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}