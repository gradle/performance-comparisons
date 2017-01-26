package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_254 {
    private final Production63_254 production = new Production63_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}