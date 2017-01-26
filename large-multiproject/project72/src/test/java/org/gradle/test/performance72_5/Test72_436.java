package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_436 {
    private final Production72_436 production = new Production72_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}