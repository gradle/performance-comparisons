package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_399 {
    private final Production39_399 production = new Production39_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}