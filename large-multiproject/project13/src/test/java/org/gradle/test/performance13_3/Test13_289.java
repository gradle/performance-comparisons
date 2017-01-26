package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_289 {
    private final Production13_289 production = new Production13_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}