package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_413 {
    private final Production39_413 production = new Production39_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}