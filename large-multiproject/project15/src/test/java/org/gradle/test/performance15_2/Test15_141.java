package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_141 {
    private final Production15_141 production = new Production15_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}