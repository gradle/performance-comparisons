package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_191 {
    private final Production18_191 production = new Production18_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}