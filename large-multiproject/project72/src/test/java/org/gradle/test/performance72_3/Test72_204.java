package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_204 {
    private final Production72_204 production = new Production72_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}