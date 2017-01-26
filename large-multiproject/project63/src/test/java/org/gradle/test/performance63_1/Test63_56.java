package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_56 {
    private final Production63_56 production = new Production63_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}