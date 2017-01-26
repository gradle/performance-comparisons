package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_104 {
    private final Production18_104 production = new Production18_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}