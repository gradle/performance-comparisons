package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_149 {
    private final Production39_149 production = new Production39_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}