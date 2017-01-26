package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_186 {
    private final Production13_186 production = new Production13_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}