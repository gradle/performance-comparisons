package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_10 {
    private final Production13_10 production = new Production13_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}