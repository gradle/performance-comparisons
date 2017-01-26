package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_126 {
    private final Production13_126 production = new Production13_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}