package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_136 {
    private final Production18_136 production = new Production18_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}