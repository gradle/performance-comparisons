package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_117 {
    private final Production91_117 production = new Production91_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}