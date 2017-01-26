package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_220 {
    private final Production13_220 production = new Production13_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}