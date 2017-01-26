package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_389 {
    private final Production18_389 production = new Production18_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}