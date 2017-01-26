package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_134 {
    private final Production13_134 production = new Production13_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}