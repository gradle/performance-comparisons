package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_278 {
    private final Production72_278 production = new Production72_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}