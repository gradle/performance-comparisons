package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_94 {
    private final Production72_94 production = new Production72_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}