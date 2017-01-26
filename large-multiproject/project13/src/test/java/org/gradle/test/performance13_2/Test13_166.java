package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_166 {
    private final Production13_166 production = new Production13_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}