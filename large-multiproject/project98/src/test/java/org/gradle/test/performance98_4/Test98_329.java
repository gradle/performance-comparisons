package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_329 {
    private final Production98_329 production = new Production98_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}