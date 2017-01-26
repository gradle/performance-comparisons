package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_248 {
    private final Production72_248 production = new Production72_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}