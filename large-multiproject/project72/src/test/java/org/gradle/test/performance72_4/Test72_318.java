package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_318 {
    private final Production72_318 production = new Production72_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}