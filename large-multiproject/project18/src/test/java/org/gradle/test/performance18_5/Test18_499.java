package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_499 {
    private final Production18_499 production = new Production18_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}