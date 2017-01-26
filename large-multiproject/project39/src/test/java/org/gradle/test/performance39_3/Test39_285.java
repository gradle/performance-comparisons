package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_285 {
    private final Production39_285 production = new Production39_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}