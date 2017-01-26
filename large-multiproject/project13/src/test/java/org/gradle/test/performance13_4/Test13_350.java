package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_350 {
    private final Production13_350 production = new Production13_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}