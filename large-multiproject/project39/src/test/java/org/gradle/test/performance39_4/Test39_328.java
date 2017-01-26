package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_328 {
    private final Production39_328 production = new Production39_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}