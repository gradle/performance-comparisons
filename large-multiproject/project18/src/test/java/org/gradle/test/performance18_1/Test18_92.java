package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_92 {
    private final Production18_92 production = new Production18_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}