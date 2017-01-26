package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_11 {
    private final Production39_11 production = new Production39_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}