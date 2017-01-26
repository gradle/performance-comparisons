package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_397 {
    private final Production91_397 production = new Production91_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}