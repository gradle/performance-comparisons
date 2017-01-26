package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_362 {
    private final Production13_362 production = new Production13_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}