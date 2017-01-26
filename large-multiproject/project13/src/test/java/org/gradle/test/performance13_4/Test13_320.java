package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_320 {
    private final Production13_320 production = new Production13_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}