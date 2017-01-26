package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_482 {
    private final Production72_482 production = new Production72_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}