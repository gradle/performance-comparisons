package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_295 {
    private final Production72_295 production = new Production72_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}