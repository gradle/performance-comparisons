package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_172 {
    private final Production13_172 production = new Production13_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}