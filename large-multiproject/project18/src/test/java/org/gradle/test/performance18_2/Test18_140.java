package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_140 {
    private final Production18_140 production = new Production18_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}