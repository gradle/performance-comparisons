package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_157 {
    private final Production13_157 production = new Production13_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}