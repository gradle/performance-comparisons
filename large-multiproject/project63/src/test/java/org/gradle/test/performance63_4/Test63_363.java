package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_363 {
    private final Production63_363 production = new Production63_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}