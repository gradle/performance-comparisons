package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_280 {
    private final Production39_280 production = new Production39_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}