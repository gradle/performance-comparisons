package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_452 {
    private final Production39_452 production = new Production39_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}