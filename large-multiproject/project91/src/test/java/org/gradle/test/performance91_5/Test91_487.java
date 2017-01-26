package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_487 {
    private final Production91_487 production = new Production91_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}