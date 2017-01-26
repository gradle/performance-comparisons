package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_192 {
    private final Production63_192 production = new Production63_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}