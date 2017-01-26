package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_322 {
    private final Production18_322 production = new Production18_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}