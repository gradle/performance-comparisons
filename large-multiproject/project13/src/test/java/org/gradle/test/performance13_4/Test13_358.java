package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_358 {
    private final Production13_358 production = new Production13_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}