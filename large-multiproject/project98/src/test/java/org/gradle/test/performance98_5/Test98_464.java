package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_464 {
    private final Production98_464 production = new Production98_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}