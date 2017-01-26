package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_309 {
    private final Production13_309 production = new Production13_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}