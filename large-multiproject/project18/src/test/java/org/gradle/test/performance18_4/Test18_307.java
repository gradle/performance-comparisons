package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_307 {
    private final Production18_307 production = new Production18_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}