package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_53 {
    private final Production13_53 production = new Production13_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}