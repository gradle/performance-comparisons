package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_143 {
    private final Production63_143 production = new Production63_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}