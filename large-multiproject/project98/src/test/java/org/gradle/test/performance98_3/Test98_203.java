package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_203 {
    private final Production98_203 production = new Production98_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}