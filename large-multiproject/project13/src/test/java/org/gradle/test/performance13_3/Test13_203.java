package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_203 {
    private final Production13_203 production = new Production13_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}