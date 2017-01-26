package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_127 {
    private final Production18_127 production = new Production18_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}