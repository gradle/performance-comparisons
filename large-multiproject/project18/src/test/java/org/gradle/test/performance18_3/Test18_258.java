package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_258 {
    private final Production18_258 production = new Production18_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}