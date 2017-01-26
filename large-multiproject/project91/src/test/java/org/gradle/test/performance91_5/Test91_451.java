package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_451 {
    private final Production91_451 production = new Production91_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}