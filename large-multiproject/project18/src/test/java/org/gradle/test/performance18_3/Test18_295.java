package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_295 {
    private final Production18_295 production = new Production18_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}