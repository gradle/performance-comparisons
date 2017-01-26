package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_382 {
    private final Production13_382 production = new Production13_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}