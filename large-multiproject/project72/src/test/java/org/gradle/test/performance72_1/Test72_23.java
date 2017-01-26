package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_23 {
    private final Production72_23 production = new Production72_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}