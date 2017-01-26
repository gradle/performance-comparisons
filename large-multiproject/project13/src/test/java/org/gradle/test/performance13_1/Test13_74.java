package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_74 {
    private final Production13_74 production = new Production13_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}