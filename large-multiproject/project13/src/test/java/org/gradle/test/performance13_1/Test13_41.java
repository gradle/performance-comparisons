package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_41 {
    private final Production13_41 production = new Production13_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}