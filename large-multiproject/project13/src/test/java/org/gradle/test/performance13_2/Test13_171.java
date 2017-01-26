package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_171 {
    private final Production13_171 production = new Production13_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}