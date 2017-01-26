package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_436 {
    private final Production63_436 production = new Production63_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}