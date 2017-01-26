package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_325 {
    private final Production13_325 production = new Production13_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}