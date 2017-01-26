package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_60 {
    private final Production98_60 production = new Production98_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}