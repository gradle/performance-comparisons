package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_233 {
    private final Production15_233 production = new Production15_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}