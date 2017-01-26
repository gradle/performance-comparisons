package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_490 {
    private final Production39_490 production = new Production39_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}