package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_470 {
    private final Production39_470 production = new Production39_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}