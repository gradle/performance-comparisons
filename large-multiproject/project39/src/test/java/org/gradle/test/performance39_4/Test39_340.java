package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_340 {
    private final Production39_340 production = new Production39_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}