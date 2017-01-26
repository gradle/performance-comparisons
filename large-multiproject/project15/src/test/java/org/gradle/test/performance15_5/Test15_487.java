package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_487 {
    private final Production15_487 production = new Production15_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}