package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_83 {
    private final Production72_83 production = new Production72_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}