package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_466 {
    private final Production13_466 production = new Production13_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}