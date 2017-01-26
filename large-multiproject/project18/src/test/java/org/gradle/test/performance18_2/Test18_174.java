package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_174 {
    private final Production18_174 production = new Production18_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}