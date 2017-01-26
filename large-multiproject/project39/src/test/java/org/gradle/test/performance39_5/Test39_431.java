package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_431 {
    private final Production39_431 production = new Production39_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}