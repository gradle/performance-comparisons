package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_304 {
    private final Production18_304 production = new Production18_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}