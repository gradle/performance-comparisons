package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_246 {
    private final Production13_246 production = new Production13_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}