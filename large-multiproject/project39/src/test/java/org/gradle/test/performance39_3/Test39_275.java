package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_275 {
    private final Production39_275 production = new Production39_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}