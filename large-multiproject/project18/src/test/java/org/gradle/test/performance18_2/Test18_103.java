package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_103 {
    private final Production18_103 production = new Production18_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}