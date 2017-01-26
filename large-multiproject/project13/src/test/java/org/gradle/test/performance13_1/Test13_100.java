package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_100 {
    private final Production13_100 production = new Production13_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}