package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_463 {
    private final Production39_463 production = new Production39_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}