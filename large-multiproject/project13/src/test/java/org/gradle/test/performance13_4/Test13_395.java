package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_395 {
    private final Production13_395 production = new Production13_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}