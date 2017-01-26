package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_431 {
    private final Production98_431 production = new Production98_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}