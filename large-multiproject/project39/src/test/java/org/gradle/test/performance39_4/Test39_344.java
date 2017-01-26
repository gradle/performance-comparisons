package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_344 {
    private final Production39_344 production = new Production39_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}