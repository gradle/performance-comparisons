package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_32 {
    private final Production72_32 production = new Production72_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}