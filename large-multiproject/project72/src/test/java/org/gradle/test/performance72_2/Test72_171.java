package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_171 {
    private final Production72_171 production = new Production72_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}