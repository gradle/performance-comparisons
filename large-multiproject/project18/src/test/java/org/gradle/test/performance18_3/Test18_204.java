package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_204 {
    private final Production18_204 production = new Production18_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}