package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_379 {
    private final Production18_379 production = new Production18_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}