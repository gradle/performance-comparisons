package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_493 {
    private final Production39_493 production = new Production39_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}