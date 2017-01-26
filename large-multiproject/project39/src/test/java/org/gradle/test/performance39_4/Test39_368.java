package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_368 {
    private final Production39_368 production = new Production39_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}