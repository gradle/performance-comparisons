package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_140 {
    private final Production13_140 production = new Production13_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}