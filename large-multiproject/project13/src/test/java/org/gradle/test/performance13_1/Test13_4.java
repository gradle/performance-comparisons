package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_4 {
    private final Production13_4 production = new Production13_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}