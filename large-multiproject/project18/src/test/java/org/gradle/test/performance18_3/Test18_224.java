package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_224 {
    private final Production18_224 production = new Production18_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}