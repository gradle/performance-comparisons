package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_357 {
    private final Production39_357 production = new Production39_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}