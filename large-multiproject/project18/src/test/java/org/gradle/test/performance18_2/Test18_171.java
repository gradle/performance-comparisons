package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_171 {
    private final Production18_171 production = new Production18_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}