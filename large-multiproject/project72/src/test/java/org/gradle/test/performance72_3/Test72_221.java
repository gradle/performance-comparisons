package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_221 {
    private final Production72_221 production = new Production72_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}