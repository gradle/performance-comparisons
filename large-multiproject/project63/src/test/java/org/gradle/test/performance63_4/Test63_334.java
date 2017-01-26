package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_334 {
    private final Production63_334 production = new Production63_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}