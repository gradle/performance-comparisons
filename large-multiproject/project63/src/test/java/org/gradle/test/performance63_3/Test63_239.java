package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_239 {
    private final Production63_239 production = new Production63_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}