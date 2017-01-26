package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_60 {
    private final Production18_60 production = new Production18_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}