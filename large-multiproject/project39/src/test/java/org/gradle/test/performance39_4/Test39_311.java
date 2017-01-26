package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_311 {
    private final Production39_311 production = new Production39_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}