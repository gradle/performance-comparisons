package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_261 {
    private final Production15_261 production = new Production15_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}