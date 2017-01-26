package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_187 {
    private final Production18_187 production = new Production18_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}