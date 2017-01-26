package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_414 {
    private final Production39_414 production = new Production39_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}