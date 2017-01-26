package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_364 {
    private final Production98_364 production = new Production98_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}