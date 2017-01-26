package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_110 {
    private final Production39_110 production = new Production39_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}