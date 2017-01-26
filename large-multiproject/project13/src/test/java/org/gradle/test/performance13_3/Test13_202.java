package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_202 {
    private final Production13_202 production = new Production13_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}