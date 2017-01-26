package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_299 {
    private final Production72_299 production = new Production72_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}