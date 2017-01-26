package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_24 {
    private final Production39_24 production = new Production39_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}