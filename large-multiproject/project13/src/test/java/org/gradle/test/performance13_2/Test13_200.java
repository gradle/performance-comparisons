package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_200 {
    private final Production13_200 production = new Production13_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}