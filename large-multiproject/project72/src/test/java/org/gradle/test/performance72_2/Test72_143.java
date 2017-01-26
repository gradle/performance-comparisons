package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_143 {
    private final Production72_143 production = new Production72_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}