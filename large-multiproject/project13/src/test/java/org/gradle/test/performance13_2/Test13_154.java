package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_154 {
    private final Production13_154 production = new Production13_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}