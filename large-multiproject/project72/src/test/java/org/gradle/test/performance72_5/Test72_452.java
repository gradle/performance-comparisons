package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_452 {
    private final Production72_452 production = new Production72_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}