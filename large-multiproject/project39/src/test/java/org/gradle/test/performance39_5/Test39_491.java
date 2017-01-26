package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_491 {
    private final Production39_491 production = new Production39_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}