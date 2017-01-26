package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_179 {
    private final Production72_179 production = new Production72_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}