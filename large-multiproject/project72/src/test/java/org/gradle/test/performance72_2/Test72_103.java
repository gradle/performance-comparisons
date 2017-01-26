package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_103 {
    private final Production72_103 production = new Production72_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}