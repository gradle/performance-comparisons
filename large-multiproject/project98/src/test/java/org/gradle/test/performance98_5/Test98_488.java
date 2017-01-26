package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_488 {
    private final Production98_488 production = new Production98_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}