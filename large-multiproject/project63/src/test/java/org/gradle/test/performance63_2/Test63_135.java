package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_135 {
    private final Production63_135 production = new Production63_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}