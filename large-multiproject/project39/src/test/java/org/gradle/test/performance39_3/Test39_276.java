package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_276 {
    private final Production39_276 production = new Production39_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}