package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_59 {
    private final Production13_59 production = new Production13_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}