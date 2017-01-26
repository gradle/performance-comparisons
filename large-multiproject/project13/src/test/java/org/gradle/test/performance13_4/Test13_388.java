package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_388 {
    private final Production13_388 production = new Production13_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}