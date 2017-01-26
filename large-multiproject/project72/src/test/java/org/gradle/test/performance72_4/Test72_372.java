package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_372 {
    private final Production72_372 production = new Production72_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}