package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_190 {
    private final Production72_190 production = new Production72_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}