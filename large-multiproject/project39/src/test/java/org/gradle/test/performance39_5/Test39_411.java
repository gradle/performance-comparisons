package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_411 {
    private final Production39_411 production = new Production39_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}