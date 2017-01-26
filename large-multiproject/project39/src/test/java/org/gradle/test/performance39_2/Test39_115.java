package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_115 {
    private final Production39_115 production = new Production39_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}