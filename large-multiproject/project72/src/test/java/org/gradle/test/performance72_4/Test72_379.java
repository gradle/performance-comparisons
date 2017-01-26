package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_379 {
    private final Production72_379 production = new Production72_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}