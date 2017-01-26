package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_197 {
    private final Production72_197 production = new Production72_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}