package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_139 {
    private final Production13_139 production = new Production13_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}