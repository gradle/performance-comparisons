package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_467 {
    private final Production39_467 production = new Production39_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}