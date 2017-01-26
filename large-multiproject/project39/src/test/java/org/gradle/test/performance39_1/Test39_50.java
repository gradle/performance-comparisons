package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_50 {
    private final Production39_50 production = new Production39_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}