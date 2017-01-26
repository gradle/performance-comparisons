package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_396 {
    private final Production98_396 production = new Production98_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}