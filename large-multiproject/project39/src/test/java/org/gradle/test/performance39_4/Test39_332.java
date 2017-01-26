package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_332 {
    private final Production39_332 production = new Production39_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}