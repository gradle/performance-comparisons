package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_29 {
    private final Production13_29 production = new Production13_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}