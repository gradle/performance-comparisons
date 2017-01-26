package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_69 {
    private final Production72_69 production = new Production72_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}