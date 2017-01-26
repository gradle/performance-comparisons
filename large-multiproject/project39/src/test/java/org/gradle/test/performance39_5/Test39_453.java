package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_453 {
    private final Production39_453 production = new Production39_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}