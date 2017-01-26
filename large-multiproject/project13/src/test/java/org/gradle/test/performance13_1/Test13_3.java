package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_3 {
    private final Production13_3 production = new Production13_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}