package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_120 {
    private final Production63_120 production = new Production63_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}