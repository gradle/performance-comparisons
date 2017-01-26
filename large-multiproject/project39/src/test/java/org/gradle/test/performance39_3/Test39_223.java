package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_223 {
    private final Production39_223 production = new Production39_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}