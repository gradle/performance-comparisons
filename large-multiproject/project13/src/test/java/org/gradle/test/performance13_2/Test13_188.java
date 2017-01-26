package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_188 {
    private final Production13_188 production = new Production13_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}