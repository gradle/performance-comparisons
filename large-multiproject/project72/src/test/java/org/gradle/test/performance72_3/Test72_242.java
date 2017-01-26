package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_242 {
    private final Production72_242 production = new Production72_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}