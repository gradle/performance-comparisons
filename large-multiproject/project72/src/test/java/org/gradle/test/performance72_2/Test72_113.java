package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_113 {
    private final Production72_113 production = new Production72_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}