package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_458 {
    private final Production13_458 production = new Production13_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}