package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_89 {
    private final Production13_89 production = new Production13_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}