package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_69 {
    private final Production63_69 production = new Production63_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}