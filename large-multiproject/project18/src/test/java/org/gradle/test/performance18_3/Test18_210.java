package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_210 {
    private final Production18_210 production = new Production18_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}