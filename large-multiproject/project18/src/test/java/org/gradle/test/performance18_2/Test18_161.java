package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_161 {
    private final Production18_161 production = new Production18_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}