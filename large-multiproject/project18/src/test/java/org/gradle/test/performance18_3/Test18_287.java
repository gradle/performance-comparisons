package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_287 {
    private final Production18_287 production = new Production18_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}