package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_48 {
    private final Production13_48 production = new Production13_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}