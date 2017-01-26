package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_2 {
    private final Production13_2 production = new Production13_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}