package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_361 {
    private final Production63_361 production = new Production63_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}