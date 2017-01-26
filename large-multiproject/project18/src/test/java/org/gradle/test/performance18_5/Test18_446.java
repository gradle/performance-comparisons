package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_446 {
    private final Production18_446 production = new Production18_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}