package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_303 {
    private final Production13_303 production = new Production13_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}