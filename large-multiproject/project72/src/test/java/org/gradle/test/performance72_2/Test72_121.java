package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_121 {
    private final Production72_121 production = new Production72_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}