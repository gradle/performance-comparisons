package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_408 {
    private final Production91_408 production = new Production91_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}