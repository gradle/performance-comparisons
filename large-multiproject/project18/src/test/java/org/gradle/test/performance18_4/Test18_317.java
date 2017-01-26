package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_317 {
    private final Production18_317 production = new Production18_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}