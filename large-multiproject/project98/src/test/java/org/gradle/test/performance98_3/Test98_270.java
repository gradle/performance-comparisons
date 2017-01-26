package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_270 {
    private final Production98_270 production = new Production98_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}