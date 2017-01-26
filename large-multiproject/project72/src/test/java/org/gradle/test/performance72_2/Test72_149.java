package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_149 {
    private final Production72_149 production = new Production72_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}