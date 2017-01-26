package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_201 {
    private final Production72_201 production = new Production72_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}