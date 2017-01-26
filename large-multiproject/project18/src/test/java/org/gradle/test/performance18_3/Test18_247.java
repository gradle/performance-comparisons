package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_247 {
    private final Production18_247 production = new Production18_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}