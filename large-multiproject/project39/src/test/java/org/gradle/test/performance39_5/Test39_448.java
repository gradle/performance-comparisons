package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_448 {
    private final Production39_448 production = new Production39_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}