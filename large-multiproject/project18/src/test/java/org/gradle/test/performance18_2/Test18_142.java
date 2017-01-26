package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_142 {
    private final Production18_142 production = new Production18_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}