package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_464 {
    private final Production39_464 production = new Production39_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}