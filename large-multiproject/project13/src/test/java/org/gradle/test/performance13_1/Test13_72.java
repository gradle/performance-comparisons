package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_72 {
    private final Production13_72 production = new Production13_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}