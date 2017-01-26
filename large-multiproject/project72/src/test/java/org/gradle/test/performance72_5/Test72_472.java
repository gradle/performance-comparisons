package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_472 {
    private final Production72_472 production = new Production72_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}