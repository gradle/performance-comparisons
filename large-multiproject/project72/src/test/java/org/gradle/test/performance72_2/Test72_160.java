package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_160 {
    private final Production72_160 production = new Production72_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}