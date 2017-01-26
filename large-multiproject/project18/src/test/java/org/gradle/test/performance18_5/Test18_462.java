package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_462 {
    private final Production18_462 production = new Production18_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}