package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_451 {
    private final Production15_451 production = new Production15_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}