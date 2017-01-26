package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_222 {
    private final Production13_222 production = new Production13_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}