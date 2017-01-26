package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_119 {
    private final Production13_119 production = new Production13_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}