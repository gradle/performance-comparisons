package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_67 {
    private final Production13_67 production = new Production13_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}