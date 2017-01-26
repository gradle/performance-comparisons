package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_162 {
    private final Production18_162 production = new Production18_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}