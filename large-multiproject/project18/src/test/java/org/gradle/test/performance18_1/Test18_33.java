package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_33 {
    private final Production18_33 production = new Production18_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}