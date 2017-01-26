package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_204 {
    private final Production13_204 production = new Production13_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}