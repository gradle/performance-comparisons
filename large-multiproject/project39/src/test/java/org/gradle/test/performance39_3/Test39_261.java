package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_261 {
    private final Production39_261 production = new Production39_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}