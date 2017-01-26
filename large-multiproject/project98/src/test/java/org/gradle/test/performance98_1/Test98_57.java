package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_57 {
    private final Production98_57 production = new Production98_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}