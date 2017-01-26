package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_116 {
    private final Production72_116 production = new Production72_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}