package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_221 {
    private final Production63_221 production = new Production63_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}