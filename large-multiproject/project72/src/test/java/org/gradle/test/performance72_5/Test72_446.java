package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_446 {
    private final Production72_446 production = new Production72_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}