package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_436 {
    private final Production18_436 production = new Production18_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}