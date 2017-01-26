package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_280 {
    private final Production15_280 production = new Production15_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}