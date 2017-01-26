package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_216 {
    private final Production13_216 production = new Production13_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}