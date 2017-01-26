package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_381 {
    private final Production18_381 production = new Production18_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}