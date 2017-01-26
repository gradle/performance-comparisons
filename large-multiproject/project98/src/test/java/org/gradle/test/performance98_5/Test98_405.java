package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_405 {
    private final Production98_405 production = new Production98_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}