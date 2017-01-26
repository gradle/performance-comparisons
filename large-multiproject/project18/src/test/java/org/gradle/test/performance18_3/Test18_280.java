package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_280 {
    private final Production18_280 production = new Production18_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}