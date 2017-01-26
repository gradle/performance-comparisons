package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_66 {
    private final Production13_66 production = new Production13_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}