package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_22 {
    private final Production39_22 production = new Production39_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}