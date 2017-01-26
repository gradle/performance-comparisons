package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_429 {
    private final Production39_429 production = new Production39_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}