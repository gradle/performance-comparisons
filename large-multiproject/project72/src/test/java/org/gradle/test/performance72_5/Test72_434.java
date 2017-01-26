package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_434 {
    private final Production72_434 production = new Production72_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}