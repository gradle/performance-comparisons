package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_328 {
    private final Production15_328 production = new Production15_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}