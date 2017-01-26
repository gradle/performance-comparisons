package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_305 {
    private final Production13_305 production = new Production13_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}