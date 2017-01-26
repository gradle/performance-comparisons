package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_132 {
    private final Production39_132 production = new Production39_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}