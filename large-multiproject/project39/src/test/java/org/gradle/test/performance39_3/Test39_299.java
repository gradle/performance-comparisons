package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_299 {
    private final Production39_299 production = new Production39_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}