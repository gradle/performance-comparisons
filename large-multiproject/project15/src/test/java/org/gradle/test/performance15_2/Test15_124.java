package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_124 {
    private final Production15_124 production = new Production15_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}