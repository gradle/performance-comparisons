package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_63 {
    private final Production13_63 production = new Production13_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}