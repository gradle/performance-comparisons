package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_489 {
    private final Production72_489 production = new Production72_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}