package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_309 {
    private final Production98_309 production = new Production98_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}