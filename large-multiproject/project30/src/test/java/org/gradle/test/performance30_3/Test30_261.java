package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_261 {
    private final Production30_261 production = new Production30_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}