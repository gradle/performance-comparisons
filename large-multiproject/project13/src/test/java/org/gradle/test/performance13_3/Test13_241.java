package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_241 {
    private final Production13_241 production = new Production13_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}