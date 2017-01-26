package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_135 {
    private final Production13_135 production = new Production13_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}