package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_145 {
    private final Production18_145 production = new Production18_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}