package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_287 {
    private final Production63_287 production = new Production63_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}