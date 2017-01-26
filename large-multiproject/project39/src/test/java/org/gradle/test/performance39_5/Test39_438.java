package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_438 {
    private final Production39_438 production = new Production39_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}