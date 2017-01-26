package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_187 {
    private final Production13_187 production = new Production13_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}