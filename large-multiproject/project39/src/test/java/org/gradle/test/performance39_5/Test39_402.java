package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_402 {
    private final Production39_402 production = new Production39_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}