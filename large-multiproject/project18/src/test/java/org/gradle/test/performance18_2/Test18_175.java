package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_175 {
    private final Production18_175 production = new Production18_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}