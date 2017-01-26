package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_359 {
    private final Production39_359 production = new Production39_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}