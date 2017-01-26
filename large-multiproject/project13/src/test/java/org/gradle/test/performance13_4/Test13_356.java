package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_356 {
    private final Production13_356 production = new Production13_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}