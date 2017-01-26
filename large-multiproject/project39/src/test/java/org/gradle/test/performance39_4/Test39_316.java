package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_316 {
    private final Production39_316 production = new Production39_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}