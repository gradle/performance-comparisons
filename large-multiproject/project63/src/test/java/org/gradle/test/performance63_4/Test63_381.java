package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_381 {
    private final Production63_381 production = new Production63_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}