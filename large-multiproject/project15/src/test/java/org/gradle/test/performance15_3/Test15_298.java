package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_298 {
    private final Production15_298 production = new Production15_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}