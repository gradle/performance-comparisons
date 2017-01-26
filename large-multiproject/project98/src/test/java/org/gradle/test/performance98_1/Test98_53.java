package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_53 {
    private final Production98_53 production = new Production98_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}