package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_81 {
    private final Production98_81 production = new Production98_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}