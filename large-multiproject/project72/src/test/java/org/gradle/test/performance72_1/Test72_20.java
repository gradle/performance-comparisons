package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_20 {
    private final Production72_20 production = new Production72_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}