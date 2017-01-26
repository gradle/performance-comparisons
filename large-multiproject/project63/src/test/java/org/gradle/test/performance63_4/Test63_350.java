package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_350 {
    private final Production63_350 production = new Production63_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}