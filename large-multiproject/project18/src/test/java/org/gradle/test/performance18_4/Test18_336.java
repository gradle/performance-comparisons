package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_336 {
    private final Production18_336 production = new Production18_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}