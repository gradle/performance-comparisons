package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_372 {
    private final Production37_372 production = new Production37_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}