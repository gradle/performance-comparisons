package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_293 {
    private final Production13_293 production = new Production13_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}