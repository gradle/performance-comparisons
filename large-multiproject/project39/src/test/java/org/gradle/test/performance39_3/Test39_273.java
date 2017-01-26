package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_273 {
    private final Production39_273 production = new Production39_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}