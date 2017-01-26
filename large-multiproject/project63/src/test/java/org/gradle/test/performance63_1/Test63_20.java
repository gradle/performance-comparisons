package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_20 {
    private final Production63_20 production = new Production63_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}