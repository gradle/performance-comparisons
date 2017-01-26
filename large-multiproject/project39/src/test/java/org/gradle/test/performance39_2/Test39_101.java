package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_101 {
    private final Production39_101 production = new Production39_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}