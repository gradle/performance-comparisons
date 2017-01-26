package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_450 {
    private final Production13_450 production = new Production13_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}