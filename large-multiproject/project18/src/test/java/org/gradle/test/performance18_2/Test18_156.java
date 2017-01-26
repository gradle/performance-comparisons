package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_156 {
    private final Production18_156 production = new Production18_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}