package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_110 {
    private final Production63_110 production = new Production63_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}