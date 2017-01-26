package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_473 {
    private final Production39_473 production = new Production39_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}