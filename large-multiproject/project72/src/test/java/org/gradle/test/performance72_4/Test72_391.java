package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_391 {
    private final Production72_391 production = new Production72_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}