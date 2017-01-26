package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_214 {
    private final Production13_214 production = new Production13_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}