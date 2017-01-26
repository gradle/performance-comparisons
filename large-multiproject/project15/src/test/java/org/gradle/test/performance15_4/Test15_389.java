package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_389 {
    private final Production15_389 production = new Production15_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}