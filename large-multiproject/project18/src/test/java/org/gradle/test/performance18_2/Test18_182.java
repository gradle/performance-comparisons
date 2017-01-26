package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_182 {
    private final Production18_182 production = new Production18_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}