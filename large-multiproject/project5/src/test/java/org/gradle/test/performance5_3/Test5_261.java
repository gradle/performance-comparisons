package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_261 {
    private final Production5_261 production = new Production5_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}