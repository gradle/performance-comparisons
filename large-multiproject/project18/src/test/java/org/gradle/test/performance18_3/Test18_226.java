package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_226 {
    private final Production18_226 production = new Production18_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}