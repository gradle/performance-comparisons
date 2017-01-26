package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_419 {
    private final Production13_419 production = new Production13_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}