package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_287 {
    private final Production72_287 production = new Production72_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}