package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_420 {
    private final Production63_420 production = new Production63_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}