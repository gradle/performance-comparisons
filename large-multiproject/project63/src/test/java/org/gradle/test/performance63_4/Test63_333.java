package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_333 {
    private final Production63_333 production = new Production63_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}