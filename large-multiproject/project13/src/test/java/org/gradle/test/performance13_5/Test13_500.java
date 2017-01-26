package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_500 {
    private final Production13_500 production = new Production13_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}