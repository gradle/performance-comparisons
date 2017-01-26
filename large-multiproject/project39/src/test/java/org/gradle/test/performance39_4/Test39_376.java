package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_376 {
    private final Production39_376 production = new Production39_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}