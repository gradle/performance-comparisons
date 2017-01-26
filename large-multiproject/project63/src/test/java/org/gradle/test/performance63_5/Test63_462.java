package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_462 {
    private final Production63_462 production = new Production63_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}