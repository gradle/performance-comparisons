package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_281 {
    private final Production13_281 production = new Production13_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}