package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_284 {
    private final Production39_284 production = new Production39_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}