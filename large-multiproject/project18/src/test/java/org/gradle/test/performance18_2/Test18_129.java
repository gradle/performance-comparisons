package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_129 {
    private final Production18_129 production = new Production18_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}