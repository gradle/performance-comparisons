package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_136 {
    private final Production63_136 production = new Production63_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}