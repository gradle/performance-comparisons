package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_14 {
    private final Production13_14 production = new Production13_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}