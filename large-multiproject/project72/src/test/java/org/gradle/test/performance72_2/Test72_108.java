package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_108 {
    private final Production72_108 production = new Production72_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}