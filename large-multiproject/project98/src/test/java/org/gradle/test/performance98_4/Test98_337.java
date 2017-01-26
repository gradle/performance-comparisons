package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_337 {
    private final Production98_337 production = new Production98_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}