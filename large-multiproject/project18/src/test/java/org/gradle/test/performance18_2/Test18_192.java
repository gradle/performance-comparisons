package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_192 {
    private final Production18_192 production = new Production18_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}