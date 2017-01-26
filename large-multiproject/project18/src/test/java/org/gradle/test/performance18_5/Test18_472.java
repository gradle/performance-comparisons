package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_472 {
    private final Production18_472 production = new Production18_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}