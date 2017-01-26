package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_265 {
    private final Production18_265 production = new Production18_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}