package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_102 {
    private final Production13_102 production = new Production13_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}