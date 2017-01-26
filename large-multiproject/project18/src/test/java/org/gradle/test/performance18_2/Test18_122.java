package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_122 {
    private final Production18_122 production = new Production18_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}