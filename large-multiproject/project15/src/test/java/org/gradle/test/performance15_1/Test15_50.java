package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_50 {
    private final Production15_50 production = new Production15_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}