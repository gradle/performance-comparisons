package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_254 {
    private final Production18_254 production = new Production18_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}