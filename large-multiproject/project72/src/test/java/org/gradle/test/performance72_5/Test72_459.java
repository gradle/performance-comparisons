package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_459 {
    private final Production72_459 production = new Production72_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}