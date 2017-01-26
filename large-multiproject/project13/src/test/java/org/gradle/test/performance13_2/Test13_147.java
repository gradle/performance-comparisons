package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_147 {
    private final Production13_147 production = new Production13_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}