package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_391 {
    private final Production30_391 production = new Production30_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}