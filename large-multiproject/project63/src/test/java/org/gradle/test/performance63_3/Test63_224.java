package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_224 {
    private final Production63_224 production = new Production63_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}