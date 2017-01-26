package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_343 {
    private final Production98_343 production = new Production98_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}