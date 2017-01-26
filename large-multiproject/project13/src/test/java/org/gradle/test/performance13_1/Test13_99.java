package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_99 {
    private final Production13_99 production = new Production13_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}