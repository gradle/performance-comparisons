package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_304 {
    private final Production63_304 production = new Production63_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}