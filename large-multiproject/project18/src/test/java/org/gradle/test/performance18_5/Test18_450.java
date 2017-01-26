package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_450 {
    private final Production18_450 production = new Production18_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}