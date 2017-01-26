package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_114 {
    private final Production18_114 production = new Production18_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}