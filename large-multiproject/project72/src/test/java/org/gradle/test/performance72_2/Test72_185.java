package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_185 {
    private final Production72_185 production = new Production72_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}